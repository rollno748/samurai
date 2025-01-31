/*
 * Copyright 2003-2012 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package one.cafebabe.samurai.core;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
class TestAbbreviatedWebLogicThreadName  {

    @Test
    void testAbbreviateWebLogicThreadName() {
        assertEquals("default[0]", ThreadDumpSequence.abbreviateWebLogicThreadName("ExecuteThread: '0' for queue: 'default'"));
        assertEquals("weblogic.kernel.Default[3]", ThreadDumpSequence.abbreviateWebLogicThreadName("[STANDBY] ExecuteThread: '3' for queue: 'weblogic.kernel.Default (self-tuning)'"));
        assertEquals("weblogic.kernel.Default[2]", ThreadDumpSequence.abbreviateWebLogicThreadName("[ACTIVE] ExecuteThread: '2' for queue: 'weblogic.kernel.Default (self-tuning)'"));
    }

}
