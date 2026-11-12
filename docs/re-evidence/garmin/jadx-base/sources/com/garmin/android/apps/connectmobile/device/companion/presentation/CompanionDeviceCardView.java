package com.garmin.android.apps.connectmobile.device.companion.presentation;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import e23.l;
import kotlin.a;
import l72.y0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p3.c2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import z02.b;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR/\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011RG\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/companion/presentation/CompanionDeviceCardView;", "Li5/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ln80/a;", "<set-?>", "a", "Lp3/p1;", "getDeviceData", "()Ln80/a;", "setDeviceData", "(Ln80/a;)V", "deviceData", "Lkotlin/Function1;", "", "b", "getOnLinkDevice", "()Le23/l;", "setOnLinkDevice", "(Le23/l;)V", "onLinkDevice", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CompanionDeviceCardView extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33740c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f33741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f33742b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompanionDeviceCardView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f33741a = p0.n(null);
        this.f33742b = p0.n(null);
    }

    public static Unit b(CompanionDeviceCardView companionDeviceCardView, n80.a aVar, n80.a aVar2) {
        aVar2.getClass();
        l<n80.a, Unit> onLinkDevice = companionDeviceCardView.getOnLinkDevice();
        if (onLinkDevice != null) {
            onLinkDevice.invoke(aVar);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final n80.a getDeviceData() {
        return (n80.a) this.f33741a.getF182175a();
    }

    private final l<n80.a, Unit> getOnLinkDevice() {
        return (l) this.f33742b.getF182175a();
    }

    private final void setDeviceData(n80.a aVar) {
        this.f33741a.setValue(aVar);
    }

    private final void setOnLinkDevice(l<? super n80.a, Unit> lVar) {
        this.f33742b.setValue(lVar);
    }

    @Override // kotlin.a
    public final void Content(m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1350610319);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            n80.a deviceData = getDeviceData();
            if (deviceData == null) {
                o0VarE.C(-778330739);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-778330738);
                b.a(false, null, null, null, false, f.c(600295906, new oo0.f(12, deviceData, this), o0VarE), o0VarE, 196608, 31);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(this, i14, 10);
        }
    }

    public final void c(n80.a aVar, l<? super n80.a, Unit> lVar) {
        setDeviceData(aVar);
        setOnLinkDevice(lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompanionDeviceCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompanionDeviceCardView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ CompanionDeviceCardView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
