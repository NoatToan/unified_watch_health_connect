package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.vast.NonLinear;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes12.dex */
public class rz implements rt.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private XmlPullParser f20243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NonLinear f20244c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    @Override // com.huawei.openalliance.ad.rt.a
    public void a() {
        byte b2;
        if (this.f20244c == null || this.f20243b == null || TextUtils.isEmpty(this.f20242a)) {
            return;
        }
        hw.b("NonLinearTagHandle", "handle: %s", this.f20242a);
        String str = this.f20242a;
        str.hashCode();
        switch (str) {
            case "IFrameResource":
                b2 = 0;
                break;
            case "NonLinearClickThrough":
                b2 = 1;
                break;
            case "StaticResource":
                b2 = 2;
                break;
            case "HTMLResource":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            this.f20244c.b(rt.a(this.f20243b));
            return;
        }
        if (b2 == 1) {
            this.f20244c.d(rt.a(this.f20243b));
            return;
        }
        if (b2 == 2) {
            this.f20244c.a(rt.b(this.f20243b));
        } else if (b2 != 3) {
            hw.b("NonLinearTagHandle", "unsupported tag: %s", this.f20242a);
        } else {
            this.f20244c.c(rt.a(this.f20243b));
        }
    }

    public rz(String str, NonLinear nonLinear, XmlPullParser xmlPullParser) {
        this.f20242a = str;
        this.f20244c = nonLinear;
        this.f20243b = xmlPullParser;
    }
}
