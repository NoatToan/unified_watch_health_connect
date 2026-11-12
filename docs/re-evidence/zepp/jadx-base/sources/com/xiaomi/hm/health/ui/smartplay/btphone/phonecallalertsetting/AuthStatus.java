package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "", "", "component1", "component2", "component3", "component4", "phonePermissionEnabled", "contactPermissionEnabled", "readPhoneCallLogEnable", "disturbPermissionEnabled", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getPhonePermissionEnabled", "()Z", "setPhonePermissionEnabled", "(Z)V", "b", "getContactPermissionEnabled", "setContactPermissionEnabled", "c", "getReadPhoneCallLogEnable", "setReadPhoneCallLogEnable", GoogleApiAvailabilityLight.a, "getDisturbPermissionEnabled", "setDisturbPermissionEnabled", "<init>", "(ZZZZ)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AuthStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean phonePermissionEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean contactPermissionEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean readPhoneCallLogEnable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean disturbPermissionEnabled;

    public AuthStatus() {
        this(false, false, false, false, 15, null);
    }

    public AuthStatus(boolean z, boolean z2, boolean z3, boolean z4) {
        this.phonePermissionEnabled = z;
        this.contactPermissionEnabled = z2;
        this.readPhoneCallLogEnable = z3;
        this.disturbPermissionEnabled = z4;
    }

    public static /* synthetic */ AuthStatus copy$default(AuthStatus authStatus, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = authStatus.phonePermissionEnabled;
        }
        if ((i & 2) != 0) {
            z2 = authStatus.contactPermissionEnabled;
        }
        if ((i & 4) != 0) {
            z3 = authStatus.readPhoneCallLogEnable;
        }
        if ((i & 8) != 0) {
            z4 = authStatus.disturbPermissionEnabled;
        }
        return authStatus.copy(z, z2, z3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getPhonePermissionEnabled() {
        return this.phonePermissionEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getContactPermissionEnabled() {
        return this.contactPermissionEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getReadPhoneCallLogEnable() {
        return this.readPhoneCallLogEnable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDisturbPermissionEnabled() {
        return this.disturbPermissionEnabled;
    }

    @NotNull
    public final AuthStatus copy(boolean phonePermissionEnabled, boolean contactPermissionEnabled, boolean readPhoneCallLogEnable, boolean disturbPermissionEnabled) {
        return new AuthStatus(phonePermissionEnabled, contactPermissionEnabled, readPhoneCallLogEnable, disturbPermissionEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthStatus)) {
            return false;
        }
        AuthStatus authStatus = (AuthStatus) other;
        return this.phonePermissionEnabled == authStatus.phonePermissionEnabled && this.contactPermissionEnabled == authStatus.contactPermissionEnabled && this.readPhoneCallLogEnable == authStatus.readPhoneCallLogEnable && this.disturbPermissionEnabled == authStatus.disturbPermissionEnabled;
    }

    public final boolean getContactPermissionEnabled() {
        return this.contactPermissionEnabled;
    }

    public final boolean getDisturbPermissionEnabled() {
        return this.disturbPermissionEnabled;
    }

    public final boolean getPhonePermissionEnabled() {
        return this.phonePermissionEnabled;
    }

    public final boolean getReadPhoneCallLogEnable() {
        return this.readPhoneCallLogEnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z = this.phonePermissionEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.contactPermissionEnabled;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.readPhoneCallLogEnable;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.disturbPermissionEnabled;
        return i3 + (z4 ? 1 : z4);
    }

    public final void setContactPermissionEnabled(boolean z) {
        this.contactPermissionEnabled = z;
    }

    public final void setDisturbPermissionEnabled(boolean z) {
        this.disturbPermissionEnabled = z;
    }

    public final void setPhonePermissionEnabled(boolean z) {
        this.phonePermissionEnabled = z;
    }

    public final void setReadPhoneCallLogEnable(boolean z) {
        this.readPhoneCallLogEnable = z;
    }

    @NotNull
    public String toString() {
        return "AuthStatus(phonePermissionEnabled=" + this.phonePermissionEnabled + ", contactPermissionEnabled=" + this.contactPermissionEnabled + ", readPhoneCallLogEnable=" + this.readPhoneCallLogEnable + ", disturbPermissionEnabled=" + this.disturbPermissionEnabled + ")";
    }

    public /* synthetic */ AuthStatus(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
