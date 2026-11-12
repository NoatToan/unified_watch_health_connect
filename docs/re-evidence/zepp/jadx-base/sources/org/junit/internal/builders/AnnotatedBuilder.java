package org.junit.internal.builders;

import java.lang.reflect.Modifier;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes23.dex */
public class AnnotatedBuilder extends RunnerBuilder {
    private static final String c = "Custom runner class %s should have a public constructor with signature %s(Class testClass)";
    private final RunnerBuilder b;

    public AnnotatedBuilder(RunnerBuilder runnerBuilder) {
        this.b = runnerBuilder;
    }

    private Class<?> d(Class<?> cls) {
        if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public Runner buildRunner(Class<? extends Runner> cls, Class<?> cls2) throws Exception {
        try {
            return cls.getConstructor(Class.class).newInstance(cls2);
        } catch (NoSuchMethodException unused) {
            try {
                return cls.getConstructor(Class.class, RunnerBuilder.class).newInstance(cls2, this.b);
            } catch (NoSuchMethodException unused2) {
                String simpleName = cls.getSimpleName();
                throw new InitializationError(String.format(c, simpleName, simpleName));
            }
        }
    }

    @Override // org.junit.runners.model.RunnerBuilder
    public Runner runnerForClass(Class<?> cls) throws Exception {
        Class<?> clsD = cls;
        while (clsD != null) {
            RunWith runWith = (RunWith) clsD.getAnnotation(RunWith.class);
            if (runWith != null) {
                return buildRunner(runWith.value(), cls);
            }
            clsD = d(clsD);
        }
        return null;
    }
}
