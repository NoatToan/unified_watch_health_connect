package xw2;

import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lxw2/d;", "", "Lxw2/b;", "rtsDeviceRecord", "Lxw2/e;", "settingsUIConfiguration", "Lfx2/a;", "networkConfiguration", "", "appConsentCountry", "", "isWorldWideConfiguration", "<init>", "(Lxw2/b;Lxw2/e;Lfx2/a;Ljava/lang/String;Z)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f192453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f192454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx2.a f192455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f192456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f192457e;

    public d(b bVar, e eVar, fx2.a aVar, String str, boolean z14) {
        bVar.getClass();
        eVar.getClass();
        aVar.getClass();
        str.getClass();
        this.f192453a = bVar;
        this.f192454b = eVar;
        this.f192455c = aVar;
        this.f192456d = str;
        this.f192457e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f192453a.equals(dVar.f192453a) && this.f192454b.equals(dVar.f192454b) && this.f192455c.equals(dVar.f192455c) && this.f192456d.equals(dVar.f192456d) && this.f192457e == dVar.f192457e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f192457e) + g.j((this.f192455c.hashCode() + ((this.f192454b.hashCode() + (this.f192453a.hashCode() * 31)) * 31)) * 31, 31, this.f192456d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SettingsConfiguration(rtsDeviceRecord=");
        sb3.append(this.f192453a);
        sb3.append(", settingsUIConfiguration=");
        sb3.append(this.f192454b);
        sb3.append(", networkConfiguration=");
        sb3.append(this.f192455c);
        sb3.append(", appConsentCountry=");
        sb3.append(this.f192456d);
        sb3.append(", isWorldWideConfiguration=");
        return hb.a.k(sb3, this.f192457e, ")");
    }
}
