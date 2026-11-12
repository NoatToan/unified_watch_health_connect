package com.garmin.feature.garminpay.providers.gpay.sync;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import mn2.k;
import mn2.o;
import o13.r;
import p005kotlin.Metadata;
import p13.w;
import vb.h;
import xo2.g;
import zn2.g1;
import zn2.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/a;", "", "Lhs2/d;", "device", "Lhs2/a;", TtmlNode.TAG_METADATA, "Lzn2/g1;", "userDataManager", "Lzn2/t;", "deviceServiceProvider", "Lmn2/k;", "nfcApi", "Lmn2/o;", "ciqImageApi", "<init>", "(Lhs2/d;Lhs2/a;Lzn2/g1;Lzn2/t;Lmn2/k;Lmn2/o;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hs2.d f51355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f51356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f51357c;

    public a(hs2.d dVar, hs2.a aVar, g1 g1Var, t tVar, k kVar, o oVar) {
        dVar.getClass();
        aVar.getClass();
        g1Var.getClass();
        tVar.getClass();
        kVar.getClass();
        oVar.getClass();
        this.f51355a = dVar;
        this.f51356b = kVar;
        this.f51357c = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r9 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Enum a(a aVar, g gVar, v13.c cVar) throws Throwable {
        vo2.a aVar2;
        a aVar3;
        byte[] bArr;
        Object next;
        if (cVar instanceof vo2.a) {
            aVar2 = (vo2.a) cVar;
            int i14 = aVar2.f179113e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f179113e = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new vo2.a(aVar, cVar);
            }
        } else {
            aVar2 = new vo2.a(aVar, cVar);
        }
        Object objB = aVar2.f179111c;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f179113e;
        if (i15 != 0) {
            if (i15 == 1) {
                bArr = aVar2.f179110b;
                aVar3 = aVar2.f179109a;
                r.b(objB);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objB);
            }
            if (!((Boolean) objB).booleanValue()) {
                throw new NewFitPayTransitCardSync.SyncException("Device failed to delete metadata", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
            }
            return yo2.a.EnumC3717a.SUCCESS;
        }
        r.b(objB);
        xo2.h hVar = gVar.f191814h;
        if (hVar == null) {
            throw new NewFitPayTransitCardSync.SyncException("Unable to get credential ID from " + gVar, wo2.e.b.INVALID_COMMIT_PAYLOAD);
        }
        byte[] bArrA = hVar.a();
        ListenableFuture listenableFutureB = aVar.f51355a.B(w.c(com.garmin.device.nfc.h.b.f50886c), false);
        if (listenableFutureB == null) {
            throw new NewFitPayTransitCardSync.SyncException("Null requestDeviceCards future, cannot start request", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
        }
        aVar2.f179109a = aVar;
        aVar2.f179110b = bArrA;
        aVar2.f179113e = 1;
        objB = t53.c.b(listenableFutureB, aVar2);
        if (objB != aVar4) {
            aVar3 = aVar;
            bArr = bArrA;
        }
        return aVar4;
        Collection collection = (Collection) objB;
        if (collection == null) {
            throw new NewFitPayTransitCardSync.SyncException("Null response from device", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
        }
        Iterator it = collection.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Arrays.equals(((com.garmin.device.nfc.b) next).f50857j, bArr));
        if (((com.garmin.device.nfc.b) next) != null) {
            hs2.d dVar = aVar3.f51355a;
            vo2.b bVar = new vo2.b(bArr, null);
            aVar2.f179109a = null;
            aVar2.f179110b = null;
            aVar2.f179113e = 2;
            objB = ks2.e.d(dVar, bVar, aVar2);
        }
        return yo2.a.EnumC3717a.SUCCESS;
    }
}
