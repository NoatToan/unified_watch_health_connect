package com.garmin.android.gncs.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.garmin.android.gncs.AppManager;
import com.garmin.android.gncs.SmartNotificationsUtil;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o13.r;
import o53.b0;
import o53.e1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.c0;
import u53.o;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0083@¢\u0006\u0004\b\u0007\u0010\t\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroid/content/Context;", "appContext", "Lkotlin/Function1;", "", "Lcom/garmin/android/gncs/settings/AppInfo;", "", "onLoaded", "loadApps", "(Landroid/content/Context;Le23/l;)V", "(Landroid/content/Context;Lt13/d;)Ljava/lang/Object;", "", "Landroid/graphics/drawable/Drawable;", "getPackageDrawable", "(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "gncs-all-modules_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AppListLoaderKt {

    /* JADX INFO: renamed from: com.garmin.android.gncs.settings.AppListLoaderKt$loadApps$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.settings.AppListLoaderKt$loadApps$1", f = "AppListLoader.kt", l = {22}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ Context $appContext;
        final /* synthetic */ l<List<AppInfo>, Unit> $onLoaded;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(l<? super List<AppInfo>, Unit> lVar, Context context, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$onLoaded = lVar;
            this.$appContext = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass1(this.$onLoaded, this.$appContext, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            l lVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    l<List<AppInfo>, Unit> lVar2 = this.$onLoaded;
                    Context context = this.$appContext;
                    this.L$0 = lVar2;
                    this.label = 1;
                    Object objLoadApps = AppListLoaderKt.loadApps(context, this);
                    if (objLoadApps == aVar) {
                        return aVar;
                    }
                    lVar = lVar2;
                    obj = objLoadApps;
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lVar = (l) this.L$0;
                    r.b(obj);
                }
                lVar.invoke(obj);
            } catch (Throwable th3) {
                ih2.b.c("AppListLoader.loadApps", th3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gncs.settings.AppListLoaderKt$loadApps$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Ljava/util/ArrayList;", "Lcom/garmin/android/gncs/settings/AppInfo;", "Lkotlin/collections/ArrayList;", "<anonymous>", "(Lo53/b0;)Ljava/util/ArrayList;"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.settings.AppListLoaderKt$loadApps$3", f = "AppListLoader.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements p<b0, t13.d<? super ArrayList<AppInfo>>, Object> {
        final /* synthetic */ Context $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, t13.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$appContext = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass3(this.$appContext, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super ArrayList<AppInfo>> dVar) {
            return ((AnonymousClass3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<String> remotelyDisabledPackages;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            SmartNotificationsConfig smartNotificationsConfig = null;
            if (this.label != 0) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            try {
                smartNotificationsConfig = SmartNotificationsConfig.getInstance();
            } catch (Exception unused) {
            }
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            if (smartNotificationsConfig != null && (remotelyDisabledPackages = smartNotificationsConfig.getRemotelyDisabledPackages()) != null) {
                hashSet2.addAll(remotelyDisabledPackages);
            }
            HashSet hashSet3 = new HashSet();
            hashSet3.addAll(AppManager.INSTANCE.disabledPackages());
            ArrayList arrayList = new ArrayList();
            List<ResolveInfo> listQueryIntentActivities = this.$appContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), 0);
            listQueryIntentActivities.getClass();
            Context context = this.$appContext;
            Iterator<T> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                String str = ((ResolveInfo) it.next()).activityInfo.packageName;
                if (!hashSet.contains(str) && !hashSet2.contains(str)) {
                    hashSet.add(str);
                    str.getClass();
                    String packageDisplayName = SmartNotificationsUtil.getPackageDisplayName(context, str);
                    packageDisplayName.getClass();
                    arrayList.add(new AppInfo(str, packageDisplayName, AppListLoaderKt.getPackageDrawable(str, context), true ^ hashSet3.contains(str)));
                }
            }
            if (arrayList.size() > 1) {
                c0.u(arrayList, new Comparator() { // from class: com.garmin.android.gncs.settings.AppListLoaderKt$loadApps$3$invokeSuspend$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t7, T t14) {
                        String str2 = ((AppInfo) t7).displayName;
                        Locale locale = Locale.ROOT;
                        String lowerCase = str2.toLowerCase(locale);
                        lowerCase.getClass();
                        String lowerCase2 = ((AppInfo) t14).displayName.toLowerCase(locale);
                        lowerCase2.getClass();
                        return r13.a.b(lowerCase, lowerCase2);
                    }
                });
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable getPackageDrawable(String str, Context context) {
        ApplicationInfo applicationInfo;
        int iHashCode = str.hashCode();
        if (iHashCode == -814896906 ? str.equals(SmartNotificationsUtil.Packages.INCOMING_PACKAGE_NAME) : !(iHashCode == 708413291 ? !str.equals(SmartNotificationsUtil.Packages.MISSED_PACKAGE_NAME) : !(iHashCode == 1301891993 && str.equals(SmartNotificationsUtil.Packages.VOICEMAIL_PACKAGE_NAME)))) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getPackageInfo(str, 0).applicationInfo) == null) {
                return null;
            }
            return applicationInfo.loadIcon(packageManager);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void loadApps(Context context, l<? super List<AppInfo>, Unit> lVar) {
        context.getClass();
        lVar.getClass();
        e1 e1Var = e1.f129333a;
        x53.c cVar = s0.f129406a;
        ge1.b.T(e1Var, o.f168762a, null, new AnonymousClass1(lVar, context, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"QueryPermissionsNeeded"})
    public static final Object loadApps(Context context, t13.d<? super List<AppInfo>> dVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new AnonymousClass3(context, null), dVar);
    }
}
