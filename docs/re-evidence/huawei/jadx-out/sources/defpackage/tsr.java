package defpackage;

import android.text.TextUtils;
import com.huawei.health.messagecenter.model.MessageObject;
import java.util.Objects;

/* JADX INFO: loaded from: classes43.dex */
public class tsr extends MessageObject {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49618b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private osg f49619c;
    private int d;

    public osg b() {
        return this.f49619c;
    }

    public void b(osg osgVar) {
        this.f49619c = osgVar;
    }

    public boolean a() {
        return b() != null;
    }

    public int e() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    @Override // com.huawei.health.messagecenter.model.MessageObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tsr) {
            return TextUtils.equals(a(this), a((tsr) obj));
        }
        return false;
    }

    private String a(tsr tsrVar) {
        boolean z = tsrVar != null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(z);
        if (z) {
            stringBuffer.append(tsrVar.e()).append(tsrVar.getCreateTime()).append(tsrVar.getMsgId()).append(e(tsrVar.b())).append(tsrVar.getHarmonyImgUrl()).append(tsrVar.getDetailUri());
        }
        return stringBuffer.toString();
    }

    private String e(osg osgVar) {
        boolean z = osgVar != null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(z);
        if (z) {
            stringBuffer.append(osgVar.t()).append(osgVar.ac()).append(osgVar.h()).append(osgVar.aa()).append(osgVar.ab()).append(osgVar.y()).append(osgVar.z()).append(osgVar.c());
        }
        return stringBuffer.toString();
    }

    @Override // com.huawei.health.messagecenter.model.MessageObject
    public int hashCode() {
        if (this.f49618b == 0) {
            this.f49618b = Objects.hash(a(this));
        }
        return this.f49618b;
    }
}
