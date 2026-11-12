package defpackage;

import com.xiaomi.fitness.di.MiuiFunctionModule;
import com.xiaomi.fitness.motion.recognition.SceneStepProvider;

/* JADX INFO: loaded from: classes8.dex */
public final class f6g implements dei {
    public static SceneStepProvider a(MiuiFunctionModule miuiFunctionModule) {
        return (SceneStepProvider) f6i.c(miuiFunctionModule.provideSceneStepProvider());
    }
}
