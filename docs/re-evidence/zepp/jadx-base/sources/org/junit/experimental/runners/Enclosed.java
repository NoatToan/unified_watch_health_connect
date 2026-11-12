package org.junit.experimental.runners;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.junit.runners.Suite;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes23.dex */
public class Enclosed extends Suite {
    public Enclosed(Class<?> cls, RunnerBuilder runnerBuilder) throws Throwable {
        super(runnerBuilder, cls, k(cls.getClasses()));
    }

    private static Class<?>[] k(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class<?> cls : clsArr) {
            if (!Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add(cls);
            }
        }
        return (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }
}
