package org.junit.experimental.theories;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ParameterSupplier {
    public abstract List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) throws Throwable;
}
