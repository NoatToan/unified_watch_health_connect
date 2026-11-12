package com.garmin.android.apps.connectmobile;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i1 implements e23.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36768a;

    @Override // e23.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i14;
        int i15;
        int i16;
        switch (this.f36768a) {
            case 0:
                int i17 = GCMCommonDeepLinkHandler.f28664a;
                ((String) obj).getClass();
                ((String) obj2).getClass();
                ((String) obj3).getClass();
                ((sz0.e) obj4).getClass();
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                m2.a aVar = m2.a.f115926a;
                long j8 = ((s5.w0) obj5).f157317a;
                String string = ((CharSequence) obj4).subSequence(s5.w0.h(j8), s5.w0.g(j8)).toString();
                m2.a.f115926a.getClass();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
            case 2:
                o2.h hVar = (o2.h) obj;
                s2.e eVar = (s2.e) obj2;
                e23.a aVar2 = (e23.a) obj3;
                p3.m mVar = (p3.m) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                q2.h hVar2 = q2.h.f142173a;
                if ((iIntValue & 6) == 0) {
                    i14 = iIntValue | ((iIntValue & 8) == 0 ? mVar.B(hVar) : mVar.r(hVar) ? 4 : 2);
                } else {
                    i14 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i14 |= (iIntValue & 64) == 0 ? mVar.B(eVar) : mVar.r(eVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i14 |= mVar.r(aVar2) ? 256 : 128;
                }
                if (mVar.n(i14 & 1, (i14 & 1171) != 1170)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    q2.j.c(hVar, eVar, aVar2, mVar, i14 & 1022);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                o2.h hVar3 = (o2.h) obj;
                s2.e eVar2 = (s2.e) obj2;
                e23.a aVar3 = (e23.a) obj3;
                p3.m mVar2 = (p3.m) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                q2.h hVar4 = q2.h.f142173a;
                if ((iIntValue2 & 6) == 0) {
                    i15 = iIntValue2 | ((iIntValue2 & 8) == 0 ? mVar2.B(hVar3) : mVar2.r(hVar3) ? 4 : 2);
                } else {
                    i15 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i15 |= (iIntValue2 & 64) == 0 ? mVar2.B(eVar2) : mVar2.r(eVar2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i15 |= mVar2.r(aVar3) ? 256 : 128;
                }
                if (mVar2.n(i15 & 1, (i15 & 1171) != 1170)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    q2.j.c(hVar3, eVar2, aVar3, mVar2, i15 & 1022);
                } else {
                    mVar2.e();
                }
                break;
            default:
                o2.h hVar5 = (o2.h) obj;
                s2.e eVar3 = (s2.e) obj2;
                e23.a aVar4 = (e23.a) obj3;
                p3.m mVar3 = (p3.m) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                q2.h hVar6 = q2.h.f142173a;
                if ((iIntValue3 & 6) == 0) {
                    i16 = iIntValue3 | ((iIntValue3 & 8) == 0 ? mVar3.B(hVar5) : mVar3.r(hVar5) ? 4 : 2);
                } else {
                    i16 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i16 |= (iIntValue3 & 64) == 0 ? mVar3.B(eVar3) : mVar3.r(eVar3) ? 32 : 16;
                }
                if ((iIntValue3 & 384) == 0) {
                    i16 |= mVar3.r(aVar4) ? 256 : 128;
                }
                if (mVar3.n(i16 & 1, (i16 & 1171) != 1170)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    q2.j.c(hVar5, eVar3, aVar4, mVar3, i16 & 1022);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
