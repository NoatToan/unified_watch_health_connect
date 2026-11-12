package aq;

import android.content.Context;
import android.widget.ArrayAdapter;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Laq/q;", "Landroid/widget/ArrayAdapter;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "resource", "", "list", "<init>", "(Landroid/content/Context;ILjava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class q extends ArrayAdapter<com.garmin.android.apps.connectmobile.repcounting.model.e> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, int i14, List<? extends com.garmin.android.apps.connectmobile.repcounting.model.e> list) {
        super(context, i14, list);
        context.getClass();
        list.getClass();
    }

    public abstract void a(ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.e> arrayList);
}
