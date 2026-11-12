package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f53291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f53292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f53293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f53294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final at f53295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f53296f;

    public aj(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        this.f53293c = context.getPackageName();
        this.f53292b = sVar;
        this.f53295e = atVar;
        this.f53296f = kVar;
        this.f53294d = context;
        if (com.google.android.play.integrity.internal.ai.b(context)) {
            this.f53291a = new com.google.android.play.integrity.internal.ae(context, sVar, "IntegrityService", ak.f53297a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.z
                public final Object a(IBinder iBinder) {
                    return com.google.android.play.integrity.internal.m.b(iBinder);
                }
            }, null);
        } else {
            sVar.b("Phonesky is not installed.", new Object[0]);
            this.f53291a = null;
        }
    }

    public static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l14, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f53293c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l14 != null) {
            bundle.putLong("cloud.prj", l14.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f53291a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i14 = bundle.getInt("dialog.intent.type");
        this.f53292b.d("requestAndShowDialog(%s, %s)", this.f53293c, Integer.valueOf(i14));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f53291a.t(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i14), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f53291a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        if (com.google.android.play.integrity.internal.ai.a(this.f53294d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f53292b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f53291a.t(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e4) {
            return Tasks.forException(new IntegrityServiceException(-13, e4));
        }
    }
}
