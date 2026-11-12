package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import com.xiaomi.onetrack.OneTrack;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010%\u001a\u00020$\u0012\b\b\u0001\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR,\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006*"}, d2 = {"Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/a$a;", OneTrack.Param.BUILD, "()Landroidx/navigation/a$a;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "targetPackage", "Ljava/lang/String;", "getTargetPackage", "()Ljava/lang/String;", "setTargetPackage", "(Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "Landroid/app/Activity;", "activityClass", "Lkotlin/reflect/KClass;", "getActivityClass", "()Lkotlin/reflect/KClass;", "setActivityClass", "(Lkotlin/reflect/KClass;)V", "action", "getAction", "setAction", "Landroid/net/Uri;", "data", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "setData", "(Landroid/net/Uri;)V", "dataPattern", "getDataPattern", "setDataPattern", "Landroidx/navigation/a;", "navigator", "", "id", "<init>", "(Landroidx/navigation/a;I)V", "navigation-runtime-ktx_release"}, k = 1, mv = {1, 4, 0})
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<a.C0045a> {

    @Nullable
    private String action;

    @Nullable
    private KClass<? extends Activity> activityClass;
    private final Context context;

    @Nullable
    private Uri data;

    @Nullable
    private String dataPattern;

    @Nullable
    private String targetPackage;

    public ActivityNavigatorDestinationBuilder(@NotNull a aVar, int i) {
        super(aVar, i);
        Context contextG = aVar.g();
        Intrinsics.checkExpressionValueIsNotNull(contextG, "navigator.context");
        this.context = contextG;
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final KClass<? extends Activity> getActivityClass() {
        return this.activityClass;
    }

    @Nullable
    public final Uri getData() {
        return this.data;
    }

    @Nullable
    public final String getDataPattern() {
        return this.dataPattern;
    }

    @Nullable
    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final void setAction(@Nullable String str) {
        this.action = str;
    }

    public final void setActivityClass(@Nullable KClass<? extends Activity> kClass) {
        this.activityClass = kClass;
    }

    public final void setData(@Nullable Uri uri) {
        this.data = uri;
    }

    public final void setDataPattern(@Nullable String str) {
        this.dataPattern = str;
    }

    public final void setTargetPackage(@Nullable String str) {
        this.targetPackage = str;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @NotNull
    public a.C0045a build() {
        a.C0045a c0045a = (a.C0045a) super.build();
        c0045a.P(this.targetPackage);
        KClass<? extends Activity> kClass = this.activityClass;
        if (kClass != null) {
            c0045a.H(new ComponentName(this.context, (Class<?>) JvmClassMappingKt.getJavaClass((KClass) kClass)));
        }
        c0045a.G(this.action);
        c0045a.I(this.data);
        c0045a.L(this.dataPattern);
        return c0045a;
    }
}
