package zw2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import e23.l;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v13.i;
import zs1.t;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lzw2/g;", "", "<init>", "()V", "b", "a", "c", "Lzw2/g$a;", "Lzw2/g$b;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class g {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzw2/g$c;", "", "", "iconSet", "icon", "", "darkColor", "lightColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f207294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f207295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f207296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Long f207297d;

        public c(String str, String str2, Long l14, Long l15) {
            this.f207294a = str;
            this.f207295b = str2;
            this.f207296c = l14;
            this.f207297d = l15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f207294a, cVar.f207294a) && s.g(this.f207295b, cVar.f207295b) && s.g(this.f207296c, cVar.f207296c) && s.g(this.f207297d, cVar.f207297d);
        }

        public final int hashCode() {
            String str = this.f207294a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f207295b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l14 = this.f207296c;
            int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.f207297d;
            return iHashCode3 + (l15 != null ? l15.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("IconInfo(iconSet=", this.f207294a, ", icon=", this.f207295b, ", darkColor=");
            sbI.append(this.f207296c);
            sbI.append(", lightColor=");
            sbI.append(this.f207297d);
            sbI.append(")");
            return sbI.toString();
        }
    }

    public /* synthetic */ g(j jVar) {
        this();
    }

    private g() {
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u001e\u0010\b\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012 \b\u0002\u0010\f\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzw2/g$a;", "Lzw2/g;", "Lkotlin/Function1;", "Lt13/d;", "", "", "getDeviceName", "Landroid/graphics/drawable/Drawable;", "getDeviceImage", "Lgw2/e;", "getDeviceConnectionStatus", "getDeviceMacAddress", "getDeviceCallingAppName", "<init>", "(Le23/l;Le23/l;Le23/l;Le23/l;Le23/l;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l<t13.d<? super String>, Object> f207283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l<t13.d<? super Drawable>, Object> f207284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l<t13.d<? super gw2.e>, Object> f207285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l<t13.d<? super String>, Object> f207286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final l<t13.d<? super String>, Object> f207287e;

        /* JADX INFO: renamed from: zw2.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
        @v13.e(c = "com.garmin.realtimesettings.app.transforms.base.TransformCustomDataObject$AsyncDeviceData$1", f = "TransformCustomDataObject.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C3868a extends i implements l<t13.d, Object> {
            public C3868a(t13.d<? super C3868a> dVar) {
                super(1, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new C3868a(dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d dVar) {
                new C3868a(dVar).invokeSuspend(Unit.INSTANCE);
                return null;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super t13.d<? super String>, ? extends Object> lVar, l<? super t13.d<? super Drawable>, ? extends Object> lVar2, l<? super t13.d<? super gw2.e>, ? extends Object> lVar3, l<? super t13.d<? super String>, ? extends Object> lVar4, l<? super t13.d<? super String>, ? extends Object> lVar5) {
            super(null);
            lVar.getClass();
            lVar2.getClass();
            lVar3.getClass();
            lVar4.getClass();
            lVar5.getClass();
            this.f207283a = lVar;
            this.f207284b = lVar2;
            this.f207285c = lVar3;
            this.f207286d = lVar4;
            this.f207287e = lVar5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f207283a, aVar.f207283a) && s.g(this.f207284b, aVar.f207284b) && s.g(this.f207285c, aVar.f207285c) && s.g(this.f207286d, aVar.f207286d) && s.g(this.f207287e, aVar.f207287e);
        }

        public final int hashCode() {
            return this.f207287e.hashCode() + q6.f.h(q6.f.h(q6.f.h(this.f207283a.hashCode() * 31, this.f207284b, 31), this.f207285c, 31), this.f207286d, 31);
        }

        public final String toString() {
            return "AsyncDeviceData(getDeviceName=" + this.f207283a + ", getDeviceImage=" + this.f207284b + ", getDeviceConnectionStatus=" + this.f207285c + ", getDeviceMacAddress=" + this.f207286d + ", getDeviceCallingAppName=" + this.f207287e + ")";
        }

        public /* synthetic */ a(l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i14, j jVar) {
            this(lVar, lVar2, lVar3, lVar4, (i14 & 16) != 0 ? new C3868a(null) : lVar5);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzw2/g$b;", "Lzw2/g;", "", "deviceName", "deviceImageUrl", "Lgw2/e;", "deviceConnectionStatus", "macAddress", "deviceCallingAppName", "Lkotlin/Function2;", "Landroid/content/Context;", "formatDeviceConnectStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgw2/e;Ljava/lang/String;Ljava/lang/String;Le23/p;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f207288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f207289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final gw2.e f207290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f207291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f207292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final p<Context, gw2.e, String> f207293f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String str2, gw2.e eVar, String str3, String str4, p<? super Context, ? super gw2.e, String> pVar) {
            super(null);
            str.getClass();
            str2.getClass();
            eVar.getClass();
            str3.getClass();
            pVar.getClass();
            this.f207288a = str;
            this.f207289b = str2;
            this.f207290c = eVar;
            this.f207291d = str3;
            this.f207292e = str4;
            this.f207293f = pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f207288a, bVar.f207288a) && s.g(this.f207289b, bVar.f207289b) && this.f207290c == bVar.f207290c && s.g(this.f207291d, bVar.f207291d) && s.g(this.f207292e, bVar.f207292e) && s.g(this.f207293f, bVar.f207293f);
        }

        public final int hashCode() {
            int iJ = wr.g.j((this.f207290c.hashCode() + wr.g.j(this.f207288a.hashCode() * 31, 31, this.f207289b)) * 31, 31, this.f207291d);
            String str = this.f207292e;
            return this.f207293f.hashCode() + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("DeviceValue(deviceName=", this.f207288a, ", deviceImageUrl=", this.f207289b, ", deviceConnectionStatus=");
            sbI.append(this.f207290c);
            sbI.append(", macAddress=");
            sbI.append(this.f207291d);
            sbI.append(", deviceCallingAppName=");
            sbI.append(this.f207292e);
            sbI.append(", formatDeviceConnectStatus=");
            sbI.append(this.f207293f);
            sbI.append(")");
            return sbI.toString();
        }

        public /* synthetic */ b(String str, String str2, gw2.e eVar, String str3, String str4, p pVar, int i14, j jVar) {
            this(str, str2, eVar, str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? new t(13) : pVar);
        }
    }
}
