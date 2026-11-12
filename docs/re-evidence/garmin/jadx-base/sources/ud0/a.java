package ud0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.dogs.presentation.AllDogsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lud0/a;", "Lbe0/a;", "<init>", "()V", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements be0.a {
    @Override // be0.a
    public final void a(Context context) {
        context.getClass();
        context.startActivity(new Intent(context, (Class<?>) AllDogsActivity.class));
    }
}
