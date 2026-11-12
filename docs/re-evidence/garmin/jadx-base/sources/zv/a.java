package zv;

import bs2.bk;
import bs2.id;
import bs2.q00;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzv/a;", "Luv/h;", "", "path", "<init>", "(Ljava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements uv.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q00 f207134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final id f207135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f207136c;

    public a(String str) {
        str.getClass();
        i iVar = new i();
        this.f207134a = iVar.a(str) ? iVar.f207153a : null;
        this.f207135b = iVar.f207154b;
    }

    @Override // uv.h
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF166524c() {
        return this.f207136c;
    }

    @Override // uv.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public final id getF166523b() {
        return this.f207135b;
    }

    @Override // uv.h
    public final bk c() {
        return this.f207134a;
    }
}
