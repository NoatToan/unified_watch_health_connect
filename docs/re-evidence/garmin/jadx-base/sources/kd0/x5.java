package kd0;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.personalrecords.presentation.activity.PersonalRecordsActivity;
import com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesActivity;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkd0/x5;", "Lmq1/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x5 implements mq1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104448a;

    public x5(Context context) {
        context.getClass();
        this.f104448a = context;
    }

    @Override // mq1.a
    public final Intent a() {
        return PersonalRecordsActivity.a.b(PersonalRecordsActivity.f40337b, this.f104448a, q91.g.STEPS, null, null, 12);
    }

    @Override // mq1.a
    public final Intent b(DateTime dateTime, boolean z14) {
        return dh.b.z(PushesActivity.class, this.f104448a, dateTime, z14);
    }
}
