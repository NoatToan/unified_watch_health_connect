package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes14.dex */
final class ah extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f53287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ai aiVar, String str, long j8) {
        super(str, j8);
        this.f53287a = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        return this.f53287a.f53288a.b(activity, bundle);
    }
}
