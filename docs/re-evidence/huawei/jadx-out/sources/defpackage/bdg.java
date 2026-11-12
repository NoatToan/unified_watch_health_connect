package defpackage;

import com.huawei.animation.physical2.ParamTransfer;

/* JADX INFO: loaded from: classes23.dex */
public class bdg implements ParamTransfer<Float> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1038c;

    public bdg() {
        this(0.0f);
    }

    public bdg(float f) {
        this.f1038c = f;
    }

    @Override // com.huawei.animation.physical2.ParamTransfer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float transfer(Float f, int i) {
        return Float.valueOf((float) (Math.pow(i + 1, (-this.f1038c) * 0.18f) * ((double) f.floatValue())));
    }
}
