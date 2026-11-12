package com.huawei.openalliance.ad.db.bean;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.cw;
import com.huawei.openalliance.ad.utils.g;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptionField<DATA> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class f18372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class f18373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DATA f18374c;
    private String d;

    public boolean d() {
        return !TextUtils.isEmpty(this.d);
    }

    public boolean c() {
        DATA data = this.f18374c;
        if (data instanceof String) {
            return !TextUtils.isEmpty((String) data);
        }
        return data != null;
    }

    public String b(byte[] bArr) {
        DATA dataA = a(bArr);
        String strA = g.a(dataA instanceof String ? (String) dataA : bk.b(dataA), bArr);
        this.d = strA;
        return strA;
    }

    public String b() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(DATA data) {
        this.f18374c = data;
    }

    public DATA a(byte[] bArr) {
        DATA data;
        if (this.f18372a == String.class) {
            if (TextUtils.isEmpty((String) this.f18374c)) {
                data = (DATA) g.b(this.d, bArr);
                this.f18374c = data;
            }
        } else if (this.f18374c == null) {
            data = (DATA) bk.b(g.b(this.d, bArr), this.f18372a, this.f18373b);
            this.f18374c = data;
        }
        return this.f18374c;
    }

    public DATA a(Context context) {
        DATA data;
        if (this.f18372a == String.class) {
            if (TextUtils.isEmpty((String) this.f18374c)) {
                data = (DATA) g.b(this.d, cw.b(context));
                this.f18374c = data;
            }
        } else if (this.f18374c == null) {
            data = (DATA) bk.b(g.b(this.d, cw.b(context)), this.f18372a, this.f18373b);
            this.f18374c = data;
        }
        return this.f18374c;
    }

    public DATA a() {
        return this.f18374c;
    }

    public EncryptionField(Class cls, Class cls2) {
        this.f18372a = cls;
        this.f18373b = cls2;
    }

    public EncryptionField(Class cls) {
        this.f18372a = cls;
    }
}
