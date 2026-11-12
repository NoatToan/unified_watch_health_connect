package kd0;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.personalrecords.presentation.activity.PersonalRecordsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkd0/b7;", "Lc52/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b7 implements c52.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104004a;

    public b7(Context context) {
        context.getClass();
        this.f104004a = context;
    }

    @Override // c52.a
    public final Intent a() {
        return PersonalRecordsActivity.a.b(PersonalRecordsActivity.f40337b, this.f104004a, q91.g.PARASPORTS, null, null, 12);
    }
}
