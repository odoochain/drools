/*
 * Copyright 2022 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.ruleunits.impl.domain;

import org.kie.api.definition.type.Duration;
import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;

@Role(Role.Type.EVENT)
@Duration("duration")
@Expires("10s")
public class StockTick {

    private final String company;
    private final long duration;

    public StockTick(String company) {
        this.company = company;
        this.duration = 0;
    }

    public StockTick(String company, long duration) {
        this.company = company;
        this.duration = duration;
    }

    public String getCompany() {
        return company;
    }

    public long getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "StockTick [company=" + company + ", duration=" + duration + "]";
    }

}
