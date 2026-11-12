package com.google.firebase.sessions;

import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "fid", "", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFid", "()Ljava/lang/String;", "getAuthToken", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstallationId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String authToken;
    private final String fid;

    private InstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getFid() {
        return this.fid;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "<init>", "()V", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallations", "Lcom/google/firebase/sessions/InstallationId;", "create", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lt13/d;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        
            if (r9 == r1) goto L29;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v18 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v3, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object create(FirebaseInstallationsApi firebaseInstallationsApi, t13.d<? super InstallationId> dVar) {
            InstallationId$Companion$create$1 installationId$Companion$create$1;
            ?? r14;
            String str;
            if (dVar instanceof InstallationId$Companion$create$1) {
                installationId$Companion$create$1 = (InstallationId$Companion$create$1) dVar;
                int i14 = installationId$Companion$create$1.label;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    installationId$Companion$create$1.label = i14 - Integer.MIN_VALUE;
                } else {
                    installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, dVar);
                }
            } else {
                installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, dVar);
            }
            Object objJ = installationId$Companion$create$1.result;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = installationId$Companion$create$1.label;
            String str2 = "";
            try {
                try {
                    if (i15 == 0) {
                        r.b(objJ);
                        Task<InstallationTokenResult> token = firebaseInstallationsApi.getToken(false);
                        token.getClass();
                        installationId$Companion$create$1.L$0 = firebaseInstallationsApi;
                        installationId$Companion$create$1.label = 1;
                        objJ = xy2.b.j(token, installationId$Companion$create$1);
                        firebaseInstallationsApi = firebaseInstallationsApi;
                        if (objJ == aVar) {
                        }
                        return aVar;
                    }
                    if (i15 == 1) {
                        FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) installationId$Companion$create$1.L$0;
                        r.b(objJ);
                        firebaseInstallationsApi = firebaseInstallationsApi2;
                    } else {
                        if (i15 != 2) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str3 = (String) installationId$Companion$create$1.L$0;
                        r.b(objJ);
                        firebaseInstallationsApi = str3;
                    }
                    String str4 = (String) objJ;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    return new InstallationId(str2, firebaseInstallationsApi, null);
                    String token2 = ((InstallationTokenResult) objJ).getToken();
                    r14 = firebaseInstallationsApi;
                    str = token2;
                } catch (Exception unused) {
                    r14 = firebaseInstallationsApi;
                    str = "";
                }
                Task<String> id3 = r14.getId();
                id3.getClass();
                installationId$Companion$create$1.L$0 = str;
                installationId$Companion$create$1.label = 2;
                objJ = xy2.b.j(id3, installationId$Companion$create$1);
                firebaseInstallationsApi = str;
            } catch (Exception unused2) {
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ InstallationId(String str, String str2, j jVar) {
        this(str, str2);
    }
}
