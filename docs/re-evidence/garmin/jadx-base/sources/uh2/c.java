package uh2;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luh2/c;", "Landroidx/lifecycle/x1$c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/ArrayList;", "Lsh2/a;", "Lkotlin/collections/ArrayList;", "controlsMenuList", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f171150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<sh2.a> f171151b;

    public c(Context context, ArrayList<sh2.a> arrayList) {
        context.getClass();
        arrayList.getClass();
        this.f171150a = context;
        this.f171151b = arrayList;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        return new a(this.f171150a, this.f171151b);
    }
}
