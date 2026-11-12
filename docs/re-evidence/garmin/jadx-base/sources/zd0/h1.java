package zd0;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.mobileauth.exception.NoMFATokenException;
import java.net.URI;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzd0/h1;", "Lcy2/i;", "<init>", "()V", "a", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h1 implements cy2.i {
    public static final Parcelable.Creator<h1> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Uri f204027a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<h1> {
        @Override // android.os.Parcelable.Creator
        public final h1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return new h1();
        }

        @Override // android.os.Parcelable.Creator
        public final h1[] newArray(int i14) {
            return new h1[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    @Override // cy2.i
    public final Uri B3() {
        return f204027a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x010d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[Catch: Exception -> 0x003e, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:13:0x0039, B:53:0x010e, B:55:0x0112), top: B:64:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // cy2.i
    public final Comparable e3(Uri uri, v13.c cVar) {
        i1 i1Var;
        Context contextC;
        Uri uri2;
        f12.b bVar;
        Uri uri3;
        Uri uri4;
        URI uri5;
        Uri uri6;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i14 = i1Var.f204034f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i1Var.f204034f = i14 - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(this, cVar);
            }
        } else {
            i1Var = new i1(this, cVar);
        }
        Object objM = i1Var.f204032d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i1Var.f204034f;
        if (i15 == 0) {
            o13.r.b(objM);
            f12.b bVar2 = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
            try {
                ve2.h hVar = ve2.h.USE_IF_ENABLED;
                uri.getClass();
                URI uri7 = new URI(uri.toString());
                uri2 = uri;
                try {
                    i1Var.f204029a = uri2;
                    i1Var.f204030b = bVar2;
                    i1Var.f204031c = contextC;
                    i1Var.f204034f = 1;
                    objM = bVar2.m(contextC, hVar, uri7, i1Var);
                    if (objM != aVar) {
                        bVar = bVar2;
                        uri3 = uri2;
                    }
                } catch (NoMFATokenException e4) {
                    e = e4;
                    bVar = bVar2;
                    i2.f36769a.getClass();
                    i2.a.p(a2.SUBSCRIPTIONS, "PurchaseDelegateImpl", "generateITAutoLoginURI threw exception " + e + ". Attempting to generateITAutoLoginURI with MFAAutoLoginType.SKIP.");
                    ve2.h hVar2 = ve2.h.SKIP;
                    uri2.getClass();
                    URI uri8 = new URI(uri2.toString());
                    i1Var.f204029a = uri2;
                    i1Var.f204030b = null;
                    i1Var.f204031c = null;
                    i1Var.f204034f = 2;
                    objM = bVar.m(contextC, hVar2, uri8, i1Var);
                    if (objM != aVar) {
                        uri4 = uri2;
                        uri5 = (URI) objM;
                        if (uri5 != null) {
                            String string = uri5.toString();
                            string.getClass();
                            uri6 = Uri.parse(string);
                            if (uri6 != null) {
                                uri4 = uri6;
                            }
                        }
                        return uri4;
                    }
                } catch (Exception e14) {
                    e = e14;
                    i2.f36769a.getClass();
                    i2.a.p(a2.SUBSCRIPTIONS, "PurchaseDelegateImpl", "generateITAutoLoginURI or toJavaURI threw exception " + e + ". Returning the originally provided Uri " + uri2 + ".");
                    return uri2;
                }
            } catch (NoMFATokenException e15) {
                e = e15;
                uri2 = uri;
            } catch (Exception e16) {
                e = e16;
                uri2 = uri;
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri4 = i1Var.f204029a;
            try {
                o13.r.b(objM);
                uri5 = (URI) objM;
                if (uri5 != null) {
                    String string2 = uri5.toString();
                    string2.getClass();
                    uri6 = Uri.parse(string2);
                    if (uri6 != null) {
                        uri4 = uri6;
                    }
                }
            } catch (Exception e17) {
                e = e17;
                i2.f36769a.getClass();
                i2.a.p(a2.SUBSCRIPTIONS, "PurchaseDelegateImpl", "generateITAutoLoginURI or toJavaURI threw exception " + e + ". Returning the originally provided Uri " + uri4 + ".");
            }
            return uri4;
        }
        contextC = i1Var.f204031c;
        bVar = i1Var.f204030b;
        uri3 = i1Var.f204029a;
        try {
            o13.r.b(objM);
        } catch (NoMFATokenException e18) {
            e = e18;
            uri2 = uri3;
            try {
                i2.f36769a.getClass();
                i2.a.p(a2.SUBSCRIPTIONS, "PurchaseDelegateImpl", "generateITAutoLoginURI threw exception " + e + ". Attempting to generateITAutoLoginURI with MFAAutoLoginType.SKIP.");
                ve2.h hVar3 = ve2.h.SKIP;
                uri2.getClass();
                URI uri9 = new URI(uri2.toString());
                i1Var.f204029a = uri2;
                i1Var.f204030b = null;
                i1Var.f204031c = null;
                i1Var.f204034f = 2;
                objM = bVar.m(contextC, hVar3, uri9, i1Var);
                if (objM != aVar) {
                    uri4 = uri2;
                    uri5 = (URI) objM;
                    if (uri5 != null) {
                        String string3 = uri5.toString();
                        string3.getClass();
                        uri6 = Uri.parse(string3);
                        if (uri6 != null) {
                            uri4 = uri6;
                        }
                    }
                    return uri4;
                }
                return aVar;
            } catch (Exception e19) {
                e = e19;
                uri4 = uri2;
                i2.f36769a.getClass();
                i2.a.p(a2.SUBSCRIPTIONS, "PurchaseDelegateImpl", "generateITAutoLoginURI or toJavaURI threw exception " + e + ". Returning the originally provided Uri " + uri4 + ".");
            }
        } catch (Exception e24) {
            e = e24;
            uri2 = uri3;
            i2.f36769a.getClass();
            i2.a.p(a2.SUBSCRIPTIONS, "PurchaseDelegateImpl", "generateITAutoLoginURI or toJavaURI threw exception " + e + ". Returning the originally provided Uri " + uri2 + ".");
            return uri2;
        }
        URI uri10 = (URI) objM;
        if (uri10 != null) {
            String string4 = uri10.toString();
            string4.getClass();
            Uri uri11 = Uri.parse(string4);
            if (uri11 != null) {
                return uri11;
            }
        }
        return uri3;
    }

    @Override // cy2.i
    public final void m3(Uri uri) {
        f204027a = uri;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(1);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzd0/h1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/net/Uri;", "sharedProcessPurchaseReturnUrl", "Landroid/net/Uri;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
