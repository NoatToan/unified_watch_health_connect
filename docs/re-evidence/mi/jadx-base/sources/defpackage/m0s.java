package defpackage;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* JADX INFO: loaded from: classes4.dex */
public class m0s extends YogaNodeJNIBase {
    public m0s(i0s i0sVar) {
        super(i0sVar);
    }

    public void finalize() throws Throwable {
        try {
            q0();
        } finally {
            super.finalize();
        }
    }

    public void q0() {
        long j = this.e;
        if (j != 0) {
            this.e = 0L;
            YogaNative.jni_YGNodeFree(j);
        }
    }
}
