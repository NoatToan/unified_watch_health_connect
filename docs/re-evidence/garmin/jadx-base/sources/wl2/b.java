package wl2;

import android.os.Parcelable;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.device.nfc.NfcCommandHandler;
import com.garmin.device.nfc.h;
import com.garmin.device.nfc.i;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.Executors;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pl2.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwl2/b;", "Ltl2/c;", "Ltl2/e;", "transferData", "<init>", "(Ltl2/e;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends tl2.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f186020p = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f186021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ListenableFuture<? extends Object> f186022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ListeningScheduledExecutorService f186023o;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186024a;

        static {
            int[] iArr = new int[NfcCommandHandler.e.values().length];
            try {
                iArr[NfcCommandHandler.e.ADD_CREDIT_CARD_REQUEST_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NfcCommandHandler.e.UPDATE_CREDIT_CARD_REQUEST_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NfcCommandHandler.e.DELETE_CREDIT_CARD_REQUEST_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f186024a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tl2.e eVar) {
        super(eVar, true, tl2.c.EnumC3105c.WALLET_UPDATE, "WalletDataTransfer");
        eVar.getClass();
        this.f186021m = new byte[0];
        ListenableFuture<? extends Object> listenableFutureImmediateFuture = Futures.immediateFuture(Boolean.TRUE);
        listenableFutureImmediateFuture.getClass();
        this.f186022n = listenableFutureImmediateFuture;
        this.f186023o = MoreExecutors.listeningDecorator(Executors.newSingleThreadScheduledExecutor(new ThreadFactoryBuilder().setNameFormat("WalletDataTransfer-%d").build()));
    }

    public static ListenableFuture m(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        NfcCommandHandler.e eVar = NfcCommandHandler.e.GET_TRANSIT_CARD_ID;
        h hVarH = h.h(str);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(hVarH.f50884a.length + 2).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put((byte) (((byte) eVar.f50841a) | UnsignedBytes.MAX_POWER_OF_TWO));
        byteBufferOrder.put((byte) 4);
        byte[] bArr = hVarH.f50884a;
        byteBufferOrder.put(bArr, 0, bArr.length);
        byte[] bArrArray = byteBufferOrder.array();
        bArrArray.getClass();
        SettableFuture settableFutureL = bVar.l(eVar, bArrArray, 0L);
        wl2.a aVar = new wl2.a(eVar, 3);
        ListeningScheduledExecutorService listeningScheduledExecutorService = bVar.f186023o;
        ListenableFuture listenableFutureCatchingAsync = Futures.catchingAsync(Futures.transform(settableFutureL, aVar, listeningScheduledExecutorService), Exception.class, new g(6), listeningScheduledExecutorService);
        listenableFutureCatchingAsync.getClass();
        return listenableFutureCatchingAsync;
    }

    @Override // tl2.c
    public final void b() {
        super.b();
        synchronized (this.f186021m) {
            this.f186022n.cancel(true);
        }
    }

    @Override // tl2.c
    public final void c(tl2.c.b bVar, tl2.a aVar) {
        bVar.getClass();
        this.f165290g.trace("End Wallet Update transfer");
        NfcCommandHandler.b bVar2 = NfcCommandHandler.b.WALLET_UPDATE_REQUEST_RESPONSE;
        Parcelable.Creator<h> creator = h.CREATOR;
        this.f165289f.c(new i(bVar2, new byte[]{(byte) (((byte) NfcCommandHandler.e.WALLET_UPDATE_COMPLETED_REQUEST_RESPONSE.f50841a) | UnsignedBytes.MAX_POWER_OF_TWO), 4}), new d(aVar, this), AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    @Override // tl2.c
    public final void d(tl2.b bVar) {
        NfcCommandHandler.b bVar2 = NfcCommandHandler.b.WALLET_UPDATE_REQUEST_RESPONSE;
        Parcelable.Creator<h> creator = h.CREATOR;
        i iVar = new i(bVar2, new byte[]{(byte) (((byte) NfcCommandHandler.e.WALLET_UPDATE_REQUEST_RESPONSE.f50841a) | UnsignedBytes.MAX_POWER_OF_TWO), 4});
        this.f165290g.trace("Start Wallet Update transfer");
        this.f165289f.c(iVar, new e(bVar, this), AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    public final ListenableFuture<Boolean> j(h[] hVarArr, long j8) {
        hVarArr.getClass();
        NfcCommandHandler.e eVar = NfcCommandHandler.e.ADD_CREDIT_CARD_REQUEST_RESPONSE;
        byte[] bArrB = h.b(hVarArr, eVar.f50841a);
        bArrB.getClass();
        SettableFuture settableFutureL = l(eVar, bArrB, j8);
        wl2.a aVar = new wl2.a(eVar, 2);
        ListeningScheduledExecutorService listeningScheduledExecutorService = this.f186023o;
        ListenableFuture<Boolean> listenableFutureCatchingAsync = Futures.catchingAsync(Futures.transform(settableFutureL, aVar, listeningScheduledExecutorService), Exception.class, new g(5), listeningScheduledExecutorService);
        listenableFutureCatchingAsync.getClass();
        return listenableFutureCatchingAsync;
    }

    public final ListenableFuture k(long j8, byte[] bArr) {
        bArr.getClass();
        NfcCommandHandler.e eVar = NfcCommandHandler.e.DELETE_CREDIT_CARD_REQUEST_RESPONSE;
        Parcelable.Creator<h> creator = h.CREATOR;
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = (byte) (((byte) eVar.f50841a) | UnsignedBytes.MAX_POWER_OF_TWO);
        bArr2[1] = 4;
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        SettableFuture settableFutureL = l(eVar, bArr2, j8);
        wl2.a aVar = new wl2.a(eVar, 1);
        ListeningScheduledExecutorService listeningScheduledExecutorService = this.f186023o;
        ListenableFuture listenableFutureCatchingAsync = Futures.catchingAsync(Futures.transform(settableFutureL, aVar, listeningScheduledExecutorService), Exception.class, new g(4), listeningScheduledExecutorService);
        listenableFutureCatchingAsync.getClass();
        return listenableFutureCatchingAsync;
    }

    public final SettableFuture l(NfcCommandHandler.e eVar, byte[] bArr, long j8) {
        String string;
        if (this.f165293j.get() != 1) {
            vb.h.z("WalletDataTransfer no longer active");
            return null;
        }
        SettableFuture settableFutureCreate = SettableFuture.create();
        synchronized (this.f186021m) {
            try {
                if (!this.f186022n.isDone() && !this.f186022n.isCancelled()) {
                    throw new IllegalStateException("WalletDataTransfer is already processing command");
                }
                settableFutureCreate.getClass();
                this.f186022n = settableFutureCreate;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        a();
        int i14 = a.f186024a[eVar.ordinal()];
        if (i14 == 1) {
            string = "ADD_CARD";
        } else if (i14 != 2) {
            string = i14 != 3 ? eVar.toString() : "DELETE_CARD";
        } else {
            string = "UPDATE_CARD";
        }
        this.f165290g.trace("Send Wallet Update Type: " + string);
        this.f165289f.c(new i(NfcCommandHandler.b.WALLET_UPDATE_REQUEST_RESPONSE, bArr), new c(this, string, settableFutureCreate), j8);
        return settableFutureCreate;
    }

    public final ListenableFuture<Boolean> n(h[] hVarArr, long j8) {
        hVarArr.getClass();
        NfcCommandHandler.e eVar = NfcCommandHandler.e.UPDATE_CREDIT_CARD_REQUEST_RESPONSE;
        byte[] bArrB = h.b(hVarArr, eVar.f50841a);
        bArrB.getClass();
        SettableFuture settableFutureL = l(eVar, bArrB, j8);
        wl2.a aVar = new wl2.a(eVar, 0);
        ListeningScheduledExecutorService listeningScheduledExecutorService = this.f186023o;
        ListenableFuture<Boolean> listenableFutureCatchingAsync = Futures.catchingAsync(Futures.transform(settableFutureL, aVar, listeningScheduledExecutorService), Exception.class, new g(3), listeningScheduledExecutorService);
        listenableFutureCatchingAsync.getClass();
        return listenableFutureCatchingAsync;
    }
}
