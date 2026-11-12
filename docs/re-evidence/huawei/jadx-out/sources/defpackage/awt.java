package defpackage;

import a.a.a.a.a.a;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.hihonor.assistant.cardmgrsdk.CardMgrSdkConst;
import com.hihonor.assistant.cardmgrsdk.model.CardDisplayRequestArg;
import com.hihonor.assistant.cardmgrsdk.model.DisplayResult;
import java.util.Optional;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class awt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f722a;

    public static final class b {
        public static final awt d = new awt();
    }

    public static awt b() {
        return b.d;
    }

    public Optional<DisplayResult> e(CardDisplayRequestArg cardDisplayRequestArg) {
        a.b("BizCardMgr", "updateCard dispArg start:" + cardDisplayRequestArg);
        if (cardDisplayRequestArg == null) {
            a.a("BizCardMgr", "updateCard args can not be null");
            return Optional.empty();
        }
        cardDisplayRequestArg.setOperation(2);
        return b(cardDisplayRequestArg);
    }

    public Optional<DisplayResult> d(CardDisplayRequestArg cardDisplayRequestArg) {
        a.b("BizCardMgr", "removeCard dispArg start:" + cardDisplayRequestArg);
        if (cardDisplayRequestArg == null) {
            a.a("BizCardMgr", "removeCard args can not be null");
            return Optional.empty();
        }
        cardDisplayRequestArg.setOperation(3);
        return b(cardDisplayRequestArg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r0 != 0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.content.ContentProviderClient] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.content.ContentProviderClient] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.content.ContentProviderClient] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a(CardDisplayRequestArg cardDisplayRequestArg) throws Throwable {
        ?? AcquireContentProviderClient;
        ?? r0;
        a.b("BizCardMgr", "queryCardInfo in");
        int i = 4;
        if (this.f722a == null) {
            a.a("BizCardMgr", "queryCardInfo should Call BizCardMgr.getInstance().init() first.");
            return 4;
        }
        if (cardDisplayRequestArg == null) {
            a.a("BizCardMgr", "queryCardInfo CardDisplayRequestArg is null.");
            return 4;
        }
        a.b("BizCardMgr", "queryCardInfo businessId:" + cardDisplayRequestArg.getBusinessId() + " business:" + cardDisplayRequestArg.getBusiness());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CardMgrSdkConst.CardInfoDesc.PARAMS_BUSINESS_ID, cardDisplayRequestArg.getBusinessId());
            jSONObject.put(CardMgrSdkConst.CardInfoDesc.PARAMS_BUSINESS, cardDisplayRequestArg.getBusiness());
        } catch (JSONException unused) {
            a.a("BizCardMgr", "queryCardInfo catch JSONException");
        }
        String string = jSONObject.toString();
        String str = null;
        ?? r1 = 0;
        ?? r2 = 0;
        try {
            try {
                AcquireContentProviderClient = this.f722a.getContentResolver().acquireContentProviderClient(Uri.parse("content://com.hihonor.assistant.yoyocard"));
                if (AcquireContentProviderClient != 0) {
                    try {
                        Bundle bundleCall = AcquireContentProviderClient.call(CardMgrSdkConst.CardMgrMethodName.METHOD_QUERY_CARD, string, null);
                        if (bundleCall != null) {
                            i = bundleCall.getInt("state", 4);
                            a.b("BizCardMgr", "queryCardInfo over:" + i);
                        }
                    } catch (RemoteException unused2) {
                        r1 = AcquireContentProviderClient;
                        a.a("BizCardMgr", "queryCardInfo RemoteException");
                        if (r1 != 0) {
                            r0 = r1;
                            AcquireContentProviderClient = r0;
                            AcquireContentProviderClient.close();
                        }
                    } catch (IllegalArgumentException unused3) {
                        r2 = AcquireContentProviderClient;
                        a.a("BizCardMgr", "queryCardInfo IllegalArgumentException");
                        r0 = r2;
                    } catch (Throwable th) {
                        th = th;
                        if (AcquireContentProviderClient != 0) {
                            AcquireContentProviderClient.close();
                        }
                        throw th;
                    }
                }
                if (AcquireContentProviderClient != 0) {
                    AcquireContentProviderClient.close();
                }
            } catch (Throwable th2) {
                th = th2;
                AcquireContentProviderClient = str;
            }
        } catch (RemoteException unused4) {
        } catch (IllegalArgumentException unused5) {
        }
        str = "queryCardInfo over: ";
        a.b("BizCardMgr", "queryCardInfo over: " + i);
        return i;
    }

    public Optional<DisplayResult> c(CardDisplayRequestArg cardDisplayRequestArg) {
        a.b("BizCardMgr", "loadCard dispArg start:" + cardDisplayRequestArg);
        if (cardDisplayRequestArg == null) {
            a.a("BizCardMgr", "loadCard args can not be null");
            return Optional.empty();
        }
        cardDisplayRequestArg.setOperation(1);
        return b(cardDisplayRequestArg);
    }

    public void c(Context context) {
        if (context == null) {
            a.a("BizCardMgr", "init context is null");
        } else {
            this.f722a = context.getApplicationContext();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    public final Optional<DisplayResult> b(CardDisplayRequestArg cardDisplayRequestArg) throws Throwable {
        ContentProviderClient contentProviderClientAcquireContentProviderClient;
        a.b("BizCardMgr", "operateCard in");
        Context context = this.f722a;
        if (context == null) {
            a.a("BizCardMgr", "operateCard should Call BizCardMgr.getInstance().init() first.");
            return Optional.empty();
        }
        ContentProviderClient contentProviderClient = null;
        Object displayResult = null;
        contentProviderClient = null;
        try {
            try {
                contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(Uri.parse("content://com.hihonor.assistant.yoyocard"));
                if (contentProviderClientAcquireContentProviderClient != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable(CardMgrSdkConst.CardInfoDesc.DISPLAY_ARG, cardDisplayRequestArg);
                        Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call(CardMgrSdkConst.CardMgrMethodName.METHOD_DISPLAY_CARD, "", bundle);
                        if (bundleCall == null) {
                            a.c("BizCardMgr", "operateCard bundle is null");
                            Optional<DisplayResult> optionalEmpty = Optional.empty();
                            contentProviderClientAcquireContentProviderClient.close();
                            return optionalEmpty;
                        }
                        bundleCall.setClassLoader(DisplayResult.class.getClassLoader());
                        Parcelable parcelable = bundleCall.getParcelable(CardMgrSdkConst.CardInfoDesc.DISPLAY_RESULT);
                        a.b("BizCardMgr", "parcelable: " + parcelable);
                        displayResult = parcelable instanceof DisplayResult ? (DisplayResult) parcelable : new DisplayResult(cardDisplayRequestArg.getBusinessId(), cardDisplayRequestArg.getBusiness(), 203);
                        a.b("BizCardMgr", "operateCard dispArg over:" + displayResult);
                    } catch (RemoteException unused) {
                        contentProviderClient = contentProviderClientAcquireContentProviderClient;
                        a.a("BizCardMgr", "operateCard RemoteException");
                        if (contentProviderClient != null) {
                            contentProviderClientAcquireContentProviderClient = contentProviderClient;
                            displayResult = contentProviderClient;
                        } else {
                            displayResult = contentProviderClient;
                        }
                        return Optional.ofNullable(displayResult);
                    } catch (IllegalArgumentException unused2) {
                        contentProviderClient = contentProviderClientAcquireContentProviderClient;
                        a.a("BizCardMgr", "operateCard IllegalArgumentException");
                        if (contentProviderClient != null) {
                            contentProviderClientAcquireContentProviderClient = contentProviderClient;
                            displayResult = contentProviderClient;
                        } else {
                            displayResult = contentProviderClient;
                        }
                        return Optional.ofNullable(displayResult);
                    } catch (Throwable th) {
                        th = th;
                        if (contentProviderClientAcquireContentProviderClient != null) {
                            contentProviderClientAcquireContentProviderClient.close();
                        }
                        throw th;
                    }
                }
                if (contentProviderClientAcquireContentProviderClient != null) {
                    contentProviderClientAcquireContentProviderClient.close();
                }
            } catch (Throwable th2) {
                th = th2;
                contentProviderClientAcquireContentProviderClient = null;
            }
        } catch (RemoteException unused3) {
        } catch (IllegalArgumentException unused4) {
        }
        return Optional.ofNullable(displayResult);
    }
}
