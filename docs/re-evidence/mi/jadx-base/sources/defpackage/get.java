package defpackage;

import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class get implements r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public z8 f18908a;

    public get(@Nullable z8 z8Var) {
        this.f18908a = z8Var;
    }

    @Override // defpackage.r5
    public boolean setCustomVibrate(@NotNull qos qosVar) {
        if (this.f18908a == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(32);
            byteArrayOutputStream.write(qosVar.c());
            boolean zC = this.f18908a.c(byteArrayOutputStream.toByteArray(), 2);
            t5t.d("CustomVibrateDefaultImpl", "setCustomVibrate: " + zC);
            return zC;
        } catch (Exception e) {
            t5t.d("CustomVibrateDefaultImpl", "setCustomVibrate: " + e.toString());
            return false;
        }
    }
}
