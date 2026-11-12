package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.vast.Impression;
import com.huawei.openalliance.ad.beans.vast.VastContent;
import com.huawei.openalliance.ad.constant.VastTag;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes12.dex */
public class ry implements rt.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VastContent f20240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private XmlPullParser f20241c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    @Override // com.huawei.openalliance.ad.rt.a
    public void a() {
        byte b2;
        if (this.f20241c == null || this.f20240b == null || TextUtils.isEmpty(this.f20239a)) {
            return;
        }
        if (hw.a()) {
            hw.a("InlineHandle", "handle: %s", this.f20239a);
        }
        String str = this.f20239a;
        str.hashCode();
        switch (str) {
            case "Creatives":
                b2 = 0;
                break;
            case "AdSystem":
                b2 = 1;
                break;
            case "Description":
                b2 = 2;
                break;
            case "AdTitle":
                b2 = 3;
                break;
            case "Advertiser":
                b2 = 4;
                break;
            case "Impression":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            VastContent vastContent = this.f20240b;
            vastContent.a(rt.c(this.f20241c, vastContent));
            return;
        }
        if (b2 == 1) {
            String attributeValue = this.f20241c.getAttributeValue(VastTag.NAMESPACE, "version");
            this.f20240b.b(rt.a(this.f20241c));
            this.f20240b.c(attributeValue);
        } else {
            if (b2 == 2) {
                this.f20240b.e(rt.a(this.f20241c));
                return;
            }
            if (b2 == 3) {
                this.f20240b.d(rt.a(this.f20241c));
                return;
            }
            if (b2 == 4) {
                this.f20240b.f(rt.a(this.f20241c));
            } else if (b2 != 5) {
                hw.b("InlineHandle", "unsupported tag: %s", this.f20239a);
            } else {
                this.f20240b.a(new Impression(this.f20241c.getAttributeValue(VastTag.NAMESPACE, "id"), rt.a(this.f20241c)));
            }
        }
    }

    public ry(String str, VastContent vastContent, XmlPullParser xmlPullParser) {
        this.f20239a = str;
        this.f20240b = vastContent;
        this.f20241c = xmlPullParser;
    }
}
