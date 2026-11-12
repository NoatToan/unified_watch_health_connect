package ol1;

import android.content.Intent;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lol1/j;", "Landroidx/lifecycle/x1$c;", "Landroid/content/Intent;", "intent", "Lzx/f;", "calendarRepository", "Ld60/b;", "courseRepository", "<init>", "(Landroid/content/Intent;Lzx/f;Ld60/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f132869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zx.f f132870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d60.b f132871c;

    public j(Intent intent, zx.f fVar, d60.b bVar) {
        intent.getClass();
        fVar.getClass();
        bVar.getClass();
        this.f132869a = intent;
        this.f132870b = fVar;
        this.f132871c = bVar;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        String stringExtra;
        cls.getClass();
        if (!cls.isAssignableFrom(com.garmin.android.apps.connectmobile.shareableevents.a.class)) {
            vb.h.s("Incompatible ViewModel Not Found");
            return null;
        }
        Intent intent = this.f132869a;
        boolean zHasExtra = intent.hasExtra("eventIdExtraKey");
        d60.b bVar = this.f132871c;
        zx.f fVar = this.f132870b;
        if (zHasExtra) {
            return new com.garmin.android.apps.connectmobile.shareableevents.a(intent.getLongExtra("eventIdExtraKey", -1L), fVar, bVar);
        }
        return (!intent.hasExtra("eventUuidExtraKey") || (stringExtra = intent.getStringExtra("eventUuidExtraKey")) == null) ? new com.garmin.android.apps.connectmobile.shareableevents.a(fVar, bVar) : new com.garmin.android.apps.connectmobile.shareableevents.a(stringExtra, fVar, bVar);
    }
}
