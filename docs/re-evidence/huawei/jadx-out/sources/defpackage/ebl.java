package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class ebl implements Serializable {
    private static final long serialVersionUID = -2788623292434891852L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32679b = -1;

    public int a() {
        return this.f32679b;
    }

    public void a(int i) {
        this.f32679b = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("BaseEntityModel{errorCode =");
        stringBuffer.append(this.f32679b);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
