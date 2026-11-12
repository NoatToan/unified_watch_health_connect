package com.garmin.feature.garminpay.ui.dev.devices;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.device.nfc.h;
import com.google.common.util.concurrent.ListenableFuture;
import e13.j;
import e23.p;
import hg1.g;
import ir2.f;
import j23.k;
import j23.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import lc.u0;
import mn2.o;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import o53.s0;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w0;
import p13.h0;
import p13.p0;
import p13.w;
import p13.y;
import ps2.n;
import v13.e;
import v13.i;
import w2.a0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\b¨\u0006\u0011²\u0006\u0014\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/feature/garminpay/ui/dev/devices/WalletMessageConsoleActivity;", "Lhn2/c;", "<init>", "()V", "Landroid/view/View;", "view", "", "addMetadata", "(Landroid/view/View;)V", "getMetadataList", "inputCardIdToDeleteMetadata", "showHintBeforeDeletingAllMetadata", "forceMetadataSync", "a", "Lmn2/o;", "kotlin.jvm.PlatformType", "gcsImageApi", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WalletMessageConsoleActivity extends hn2.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f51900i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f51901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f51902k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h[] f51903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hs2.d f51904h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$addMetadata$1", f = "WalletMessageConsoleActivity.kt", l = {267}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51905a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$addMetadata$1$result$1", f = "WalletMessageConsoleActivity.kt", l = {268}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f51907a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletMessageConsoleActivity f51908b;

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwl2/b;", "", "<anonymous>", "(Lwl2/b;)Z"}, k = 3, mv = {2, 3, 0})
            @e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$addMetadata$1$result$1$1", f = "WalletMessageConsoleActivity.kt", l = {268}, m = "invokeSuspend", v = 2)
            public static final class C1083a extends i implements p<wl2.b, t13.d<? super Boolean>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f51909a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f51910b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ WalletMessageConsoleActivity f51911c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1083a(WalletMessageConsoleActivity walletMessageConsoleActivity, t13.d<? super C1083a> dVar) {
                    super(2, dVar);
                    this.f51911c = walletMessageConsoleActivity;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    C1083a c1083a = new C1083a(this.f51911c, dVar);
                    c1083a.f51910b = obj;
                    return c1083a;
                }

                @Override // e23.p
                public final Object invoke(wl2.b bVar, t13.d<? super Boolean> dVar) {
                    return ((C1083a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    wl2.b bVar = (wl2.b) this.f51910b;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f51909a;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            r.b(obj);
                            return obj;
                        }
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                    w0 w0Var = new w0(2);
                    h[] hVarArr = this.f51911c.f51903g;
                    if (hVarArr == null) {
                        s.m("fakeCardImageTlvs");
                        throw null;
                    }
                    w0Var.b(hVarArr);
                    WalletMessageConsoleActivity.f51900i.getClass();
                    ArrayList arrayListA0 = h0.A0(new j23.c('A', 'F'), new j23.c('0', '9'));
                    h23.c.f81216a.getClass();
                    int iD = h23.c.f81217b.d(1, 63) * 2;
                    l lVar = new l(1, iD);
                    ArrayList arrayList = new ArrayList(y.r(lVar, 10));
                    Iterator<Integer> it = lVar.iterator();
                    while (((k) it).f96801c) {
                        ((p0) it).nextInt();
                        Character ch3 = (Character) h0.E0(arrayListA0, h23.c.f81216a);
                        ch3.getClass();
                        arrayList.add(ch3);
                    }
                    String strK0 = h0.k0(arrayList, "", null, null, null, 62);
                    WalletMessageConsoleActivity.f51901j.trace("Card ID of length " + iD + ": " + strK0);
                    h hVarI = h.i(hb2.d.a(strK0));
                    h hVarH = h.h("FAKE");
                    h hVar = new h(h.c.TAG_ISSUER_NAME, "FAKE".getBytes());
                    h hVar2 = new h(h.c.TAG_CARD_ACTIVE, new byte[]{1});
                    h hVar3 = new h(h.c.TAG_PAN, new byte[]{(byte) 9999, (byte) 39});
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            Charset charset = d53.c.f57666b;
                            byte[] bytes = "FAKE".getBytes(charset);
                            bytes.getClass();
                            byteArrayOutputStream.write(bytes);
                            byte[] bytes2 = "FAKE".getBytes(charset);
                            bytes2.getClass();
                            byteArrayOutputStream.write(bytes2);
                            byteArrayOutputStream.write(WalletMessageConsoleActivity.f51902k);
                            byteArrayOutputStream.write(new byte[]{1});
                            byteArrayOutputStream.flush();
                            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                            messageDigest.update(byteArrayOutputStream.toByteArray());
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(messageDigest.digest(), 0, 8);
                            bArrCopyOfRange.getClass();
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e4) {
                                WalletMessageConsoleActivity.f51901j.warn("baos.close() throws", (Throwable) e4);
                            }
                            w0Var.b(new h[]{hVarI, hVarH, hVar, hVar2, hVar3, new h(h.c.TAG_CREDIT_CARD_HASH, bArrCopyOfRange), new h(h.c.TAG_EXP_MONTH, new byte[]{(byte) 1}), new h(h.c.TAG_EXP_YEAR, new byte[]{(byte) 2030, (byte) 7}), new h(h.c.TAG_DESCRIPTION, "FAKE".getBytes()), new h(h.c.TAG_TOP_OF_WALLET_APDU, WalletMessageConsoleActivity.f51902k)});
                            ArrayList<Object> arrayList2 = w0Var.f105816a;
                            h[] hVarArr2 = (h[]) arrayList2.toArray(new h[arrayList2.size()]);
                            int i15 = wl2.b.f186020p;
                            ListenableFuture<Boolean> listenableFutureJ = bVar.j(hVarArr2, 0L);
                            this.f51910b = null;
                            this.f51909a = 1;
                            Object objB = t53.c.b(listenableFutureJ, this);
                            return objB == aVar ? aVar : objB;
                        } catch (IOException e14) {
                            WalletMessageConsoleActivity.f51901j.error("calculateHash", (Throwable) e14);
                            throw new IllegalStateException(e14);
                        } catch (NoSuchAlgorithmException e15) {
                            WalletMessageConsoleActivity.f51901j.error("calculateHash", (Throwable) e15);
                            throw new IllegalStateException(e15);
                        }
                    } catch (Throwable th3) {
                        try {
                            byteArrayOutputStream.close();
                            throw th3;
                        } catch (IOException e16) {
                            WalletMessageConsoleActivity.f51901j.warn("baos.close() throws", (Throwable) e16);
                            throw th3;
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletMessageConsoleActivity walletMessageConsoleActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f51908b = walletMessageConsoleActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f51908b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f51907a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                WalletMessageConsoleActivity walletMessageConsoleActivity = this.f51908b;
                hs2.d dVar = walletMessageConsoleActivity.f51904h;
                if (dVar == null) {
                    s.m("managedPayDevice");
                    throw null;
                }
                C1083a c1083a = new C1083a(walletMessageConsoleActivity, null);
                this.f51907a = 1;
                Object objD = ks2.e.d(dVar, c1083a, this);
                return objD == aVar ? aVar : objD;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return WalletMessageConsoleActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51905a;
            WalletMessageConsoleActivity walletMessageConsoleActivity = WalletMessageConsoleActivity.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    hn2.c.ba(walletMessageConsoleActivity, Boolean.TRUE, "Adding a fake metadata...", null, 12);
                    x53.c cVar = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    a aVar2 = new a(walletMessageConsoleActivity, null);
                    this.f51905a = 1;
                    obj = ge1.b.e0(bVar, aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                WalletMessageConsoleActivity.da(walletMessageConsoleActivity, "Adding card result: " + ((Boolean) obj).booleanValue());
            } catch (Throwable th3) {
                try {
                    WalletMessageConsoleActivity.f51901j.error("Failed to add metadata", th3);
                    WalletMessageConsoleActivity.da(walletMessageConsoleActivity, "Failed to add metadata");
                } finally {
                    hn2.c.ba(walletMessageConsoleActivity, Boolean.FALSE, null, null, 14);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$forceMetadataSync$1", f = "WalletMessageConsoleActivity.kt", l = {390}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51912a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$forceMetadataSync$1$1", f = "WalletMessageConsoleActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {
            public a(t13.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return new a(dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return WalletMessageConsoleActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51912a;
            WalletMessageConsoleActivity walletMessageConsoleActivity = WalletMessageConsoleActivity.this;
            if (i14 == 0) {
                r.b(obj);
                hn2.c.ba(walletMessageConsoleActivity, Boolean.TRUE, null, null, 14);
                Toast.makeText(walletMessageConsoleActivity, "Unavailable for now. Re-enabling them needs extra efforts.", 1).show();
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(null);
                this.f51912a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            hn2.c.ba(walletMessageConsoleActivity, Boolean.FALSE, null, null, 14);
            WalletMessageConsoleActivity.da(walletMessageConsoleActivity, "");
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$getMetadataList$1", f = "WalletMessageConsoleActivity.kt", l = {284}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51914a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$getMetadataList$1$message$1", f = "WalletMessageConsoleActivity.kt", l = {285}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super String>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f51916a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletMessageConsoleActivity f51917b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WalletMessageConsoleActivity walletMessageConsoleActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f51917b = walletMessageConsoleActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f51917b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f51916a;
                if (i14 == 0) {
                    r.b(obj);
                    hs2.d dVar = this.f51917b.f51904h;
                    if (dVar == null) {
                        s.m("managedPayDevice");
                        throw null;
                    }
                    ListenableFuture listenableFutureB = dVar.B(w.c(h.b.f50886c), false);
                    if (listenableFutureB != null) {
                        this.f51916a = 1;
                        obj = t53.c.b(listenableFutureB, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    o2.c.m("Failed to get all cards");
                    return null;
                }
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                Collection collection = (Collection) obj;
                if (collection != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(collection.size() + " cards:\n");
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        sb3.append(hb2.d.b(((com.garmin.device.nfc.b) it.next()).f50857j) + "\n");
                    }
                    return sb3.toString();
                }
                o2.c.m("Failed to get all cards");
                return null;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return WalletMessageConsoleActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51914a;
            WalletMessageConsoleActivity walletMessageConsoleActivity = WalletMessageConsoleActivity.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    hn2.c.ba(walletMessageConsoleActivity, Boolean.TRUE, "Getting cards...", null, 12);
                    x53.c cVar = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    a aVar2 = new a(walletMessageConsoleActivity, null);
                    this.f51914a = 1;
                    obj = ge1.b.e0(bVar, aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                obj.getClass();
                WalletMessageConsoleActivity.da(walletMessageConsoleActivity, (String) obj);
            } catch (Throwable th3) {
                try {
                    WalletMessageConsoleActivity.f51901j.error("Failed to get metadata list", th3);
                    WalletMessageConsoleActivity.da(walletMessageConsoleActivity, "Failed to get metadata list");
                } finally {
                    hn2.c.ba(walletMessageConsoleActivity, Boolean.FALSE, null, null, 14);
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f51901j = gt2.b.f79005a.h("WalletMessageConsoleActivity");
        f51902k = new byte[]{0};
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fd, code lost:
    
        if (r3 == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object ca(WalletMessageConsoleActivity walletMessageConsoleActivity, long j8, v13.c cVar) throws Throwable {
        f fVar;
        t tVarB;
        int i14;
        h[] hVarArr;
        WalletMessageConsoleActivity walletMessageConsoleActivity2 = walletMessageConsoleActivity;
        long j14 = j8;
        walletMessageConsoleActivity2.getClass();
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i15 = fVar.f94852h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f94852h = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(walletMessageConsoleActivity2, cVar);
            }
        } else {
            fVar = new f(walletMessageConsoleActivity2, cVar);
        }
        Object objF = fVar.f94850f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = fVar.f94852h;
        if (i16 != 0) {
            if (i16 == 1) {
                int i17 = fVar.f94849e;
                j14 = fVar.f94845a;
                WalletMessageConsoleActivity walletMessageConsoleActivity3 = fVar.f94847c;
                tVarB = fVar.f94846b;
                r.b(objF);
                i14 = i17;
                walletMessageConsoleActivity2 = walletMessageConsoleActivity3;
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                walletMessageConsoleActivity2 = fVar.f94848d;
                r.b(objF);
            }
            objF.getClass();
            hVarArr = (h[]) objF;
            walletMessageConsoleActivity2.f51903g = hVarArr;
            return Unit.INSTANCE;
        }
        r.b(objF);
        ps2.w.f140538a.getClass();
        n nVarI = ps2.w.i(j14);
        nVarI.getClass();
        walletMessageConsoleActivity2.f51904h = nVarI.f140499b;
        int productNumber = nVarI.f140498a.getProductNumber();
        ln2.e.f113687a.getClass();
        mn2.k kVar = (mn2.k) ln2.e.a().b(mn2.k.class);
        tVarB = m.b(new ik2.b(7));
        kVar.getClass();
        fVar.f94846b = tVarB;
        fVar.f94847c = walletMessageConsoleActivity2;
        fVar.f94845a = j14;
        fVar.f94849e = productNumber;
        fVar.f94852h = 1;
        Object objA = mn2.m.a(kVar, j14, fVar);
        if (objA != aVar) {
            i14 = productNumber;
            objF = objA;
        }
        return aVar;
        long j15 = j14;
        mn2.a aVar2 = (mn2.a) objF;
        if (aVar2 instanceof mn2.a.C2276a) {
            hVarArr = new h[0];
        } else if (aVar2 instanceof mn2.a.b) {
            ij0.a.f93807a.getClass();
            hVarArr = ij0.a.f93808b;
        } else {
            if (!(aVar2 instanceof mn2.a.c)) {
                u0.r();
                return null;
            }
            o oVar = (o) tVarB.getValue();
            oVar.getClass();
            mn2.a.c cVar2 = (mn2.a.c) aVar2;
            int i18 = cVar2.f119778a;
            int i19 = cVar2.f119779b;
            Logger logger = mn2.t.f119847a;
            wr2.i.f186861a.getClass();
            lq2.d dVar = new lq2.d(j15, 1);
            int i24 = w03.b.f181178a;
            j jVar = new j(new e13.m(dVar), new mn2.e(new mn2.p(oVar, i18, i19, j15, i14), 22));
            fVar.f94846b = null;
            fVar.f94847c = null;
            fVar.f94848d = walletMessageConsoleActivity2;
            fVar.f94845a = j15;
            fVar.f94849e = i14;
            fVar.f94852h = 2;
            objF = a0.f(jVar, fVar);
        }
        walletMessageConsoleActivity2.f51903g = hVarArr;
        return Unit.INSTANCE;
    }

    public static final void da(WalletMessageConsoleActivity walletMessageConsoleActivity, String str) {
        ((TextView) walletMessageConsoleActivity.findViewById(R.id.message)).setText(str);
    }

    public final void addMetadata(View view2) {
        view2.getClass();
        gl.b.I(f0.w(this), null, new b(null), 3);
    }

    @SuppressLint({"SetTextI18n"})
    public final void forceMetadataSync(View view2) {
        view2.getClass();
        gl.b.I(f0.w(this), null, new c(null), 3);
    }

    public final void getMetadataList(View view2) {
        view2.getClass();
        gl.b.I(f0.w(this), null, new d(null), 3);
    }

    @SuppressLint({"SetTextI18n"})
    public final void inputCardIdToDeleteMetadata(View view2) {
        view2.getClass();
        EditText editText = new EditText(this);
        new androidx.appcompat.app.e.a(this).setTitle("Type the ID").setView(editText).setPositiveButton(R.string.lbl_ok, new g(10, editText, this)).show();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"SetTextI18n"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_wallet_message_console, hn2.c.a.BACK, "Wallet Message Console");
        long longExtra = getIntent().getLongExtra("extra.unit_id", -1L);
        if (longExtra != -1) {
            ge1.b.T(f0.w(this), null, null, new ir2.e(this, longExtra, null), 3);
        } else {
            ge1.b.T(f0.w(this), null, null, new ir2.g(this, null), 3);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @SuppressLint({"SetTextI18n"})
    public final void showHintBeforeDeletingAllMetadata(View view2) {
        view2.getClass();
        new androidx.appcompat.app.e.a(this).setMessage("Do you want to delete ALL metadata? CAUTION: This means all cards added on this device will also be removed.").setPositiveButton(R.string.lbl_ok, new ir2.b(this, 0)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).show();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/garmin/feature/garminpay/ui/dev/devices/WalletMessageConsoleActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "EXTRA_UNIT_ID", "", "TRUE", "B", "", "FAKE_CARD_PAN", "I", "FAKE_CARD_NAME", "FAKE_BANK_NAME", "FAKE_MONTH", "FAKE_YEAR", "FAKE_CARD_TYPE", "", "FAKE_TOW", "[B", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
