package defpackage;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006&"}, d2 = {"Lfn;", "", "", "toString", "", "hashCode", "other", "", "equals", "uniqueId", "I", "i", "()I", "setUniqueId", "(I)V", "categoryId", PluginDeviceInfo.FDESC, "setCategoryId", "eventId", PluginDeviceInfo.FICONON, "setEventId", Constants.KEY_PACKAGE_NAME, "Ljava/lang/String;", PluginDeviceInfo.FBLUETOOTHPAIR, "()Ljava/lang/String;", "appName", PluginDeviceInfo.FMODEL, "title", "h", "msg", PluginDeviceInfo.FICONOFF, "phone", PluginDeviceInfo.FICONOFFLINE, "supportReply", PluginDeviceInfo.FLOCALIZATIONS, "setSupportReply", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public int categoryId;

    /* JADX INFO: renamed from: c, reason: from toString */
    public int eventId;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String pkgName;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final String appName;

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: g, reason: from toString */
    @NotNull
    public final String msg;

    /* JADX INFO: renamed from: h, reason: from toString */
    @NotNull
    public final String phone;

    /* JADX INFO: renamed from: i, reason: from toString */
    public int supportReply;

    public fn(int i, int i2, int i3, @NotNull String pkgName, @NotNull String appName, @NotNull String title, @NotNull String msg, @NotNull String phone, int i4) {
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f17943a = i;
        this.categoryId = i2;
        this.eventId = i3;
        this.pkgName = pkgName;
        this.appName = appName;
        this.title = title;
        this.msg = msg;
        this.phone = phone;
        this.supportReply = i4;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof fn)) {
            return false;
        }
        fn fnVar = (fn) other;
        return this.f17943a == fnVar.f17943a && this.categoryId == fnVar.categoryId && this.eventId == fnVar.eventId && Intrinsics.areEqual(this.pkgName, fnVar.pkgName) && Intrinsics.areEqual(this.appName, fnVar.appName) && Intrinsics.areEqual(this.title, fnVar.title) && Intrinsics.areEqual(this.msg, fnVar.msg) && Intrinsics.areEqual(this.phone, fnVar.phone) && this.supportReply == fnVar.supportReply;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPkgName() {
        return this.pkgName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSupportReply() {
        return this.supportReply;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f17943a) * 31) + Integer.hashCode(this.categoryId)) * 31) + Integer.hashCode(this.eventId)) * 31) + this.pkgName.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.title.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.phone.hashCode()) * 31) + Integer.hashCode(this.supportReply);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getF17943a() {
        return this.f17943a;
    }

    @NotNull
    public String toString() {
        return "NotificationInfo {uniqueId=" + this.f17943a + ", categoryId=" + this.categoryId + ", eventId=" + this.eventId + ", pkgName=" + this.pkgName + ", appName=" + this.appName + ", title=" + this.title + ", msg=" + this.msg + ", phone=" + this.phone + ", supportReply=" + this.supportReply + AbstractJsonLexerKt.END_OBJ;
    }

    public /* synthetic */ fn(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? "" : str, (i5 & 16) != 0 ? "" : str2, (i5 & 32) != 0 ? "" : str3, (i5 & 64) != 0 ? "" : str4, (i5 & 128) != 0 ? "" : str5, (i5 & 256) != 0 ? 0 : i4);
    }
}
