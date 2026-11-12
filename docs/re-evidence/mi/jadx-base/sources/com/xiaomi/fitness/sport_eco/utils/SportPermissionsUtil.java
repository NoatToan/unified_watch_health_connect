package com.xiaomi.fitness.sport_eco.utils;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.sport_eco.utils.SportPermissionsUtil;
import defpackage.av6;
import defpackage.e1j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000fJ)\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000fH\u0002J'\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0002J$\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aJ:\u0010\u001b\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0002J:\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0002J:\u0010\u001f\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0002J\u001e\u0010 \u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0002J:\u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/utils/SportPermissionsUtil;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "requestLocationIfNeed", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "extension", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/PermissionBuilder;", "Lkotlin/ExtensionFunctionType;", "showLocationTipDialog", "requestLocationDialog", "isXiaoMiAlwaysAllow", "", "locationPermissionAlwaysAllow", "", "getSportPermissions", DailyRecordKey.sportType, "", "launch", "Lkotlin/Function0;", "indoorPermission", "sportPermission", "sportPermissionDesc", "requestBodyInfoPermission", "outdoorPermission", "afterLocationPermission", "requestPermissions", "granted", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportPermissionsUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportPermissionsUtil.kt\ncom/xiaomi/fitness/sport_eco/utils/SportPermissionsUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,487:1\n37#2:488\n36#2,3:489\n37#2:492\n36#2,3:493\n37#2:496\n36#2,3:497\n37#2:500\n36#2,3:501\n37#2:507\n36#2,3:508\n37#2:511\n36#2,3:512\n37#2:515\n36#2,3:516\n37#2:519\n36#2,3:520\n37#2:523\n36#2,3:524\n37#2:527\n36#2,3:528\n37#2:535\n36#2,3:536\n774#3:504\n865#3,2:505\n1557#3:531\n1628#3,3:532\n1557#3:539\n1628#3,3:540\n*S KotlinDebug\n*F\n+ 1 SportPermissionsUtil.kt\ncom/xiaomi/fitness/sport_eco/utils/SportPermissionsUtil\n*L\n75#1:488\n75#1:489,3\n224#1:492\n224#1:493,3\n267#1:496\n267#1:497,3\n270#1:500\n270#1:501,3\n344#1:507\n344#1:508,3\n368#1:511\n368#1:512,3\n377#1:515\n377#1:516,3\n378#1:519\n378#1:520,3\n383#1:523\n383#1:524,3\n385#1:527\n385#1:528,3\n413#1:535\n413#1:536,3\n270#1:504\n270#1:505,2\n388#1:531\n388#1:532,3\n419#1:539\n419#1:540,3\n*E\n"})
public final class SportPermissionsUtil {

    @NotNull
    public static final SportPermissionsUtil INSTANCE = new SportPermissionsUtil();

    @NotNull
    private static final String TAG = "SportPermissionsUtil";

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.utils.SportPermissionsUtil$outdoorPermission$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/sport_eco/utils/SportPermissionsUtil$outdoorPermission$2", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSportPermissionsUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportPermissionsUtil.kt\ncom/xiaomi/fitness/sport_eco/utils/SportPermissionsUtil$outdoorPermission$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,487:1\n774#2:488\n865#2,2:489\n*S KotlinDebug\n*F\n+ 1 SportPermissionsUtil.kt\ncom/xiaomi/fitness/sport_eco/utils/SportPermissionsUtil$outdoorPermission$2\n*L\n316#1:488\n316#1:489,2\n*E\n"})
    public static final class AnonymousClass2 extends av6 {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Function0<Unit> $launch;
        final /* synthetic */ List<String> $sportPermission;
        final /* synthetic */ List<String> $sportPermissionDesc;

        public AnonymousClass2(List<String> list, FragmentActivity fragmentActivity, List<String> list2, Function0<Unit> function0) {
            this.$sportPermission = list;
            this.$activity = fragmentActivity;
            this.$sportPermissionDesc = list2;
            this.$launch = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$1(FragmentActivity activity, Function0 launch) {
            Intrinsics.checkNotNullParameter(activity, "$activity");
            Intrinsics.checkNotNullParameter(launch, "$launch");
            SportPermissionsUtil.INSTANCE.afterLocationPermission(activity, launch);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (dialog != null) {
                dialog.dismiss();
            }
            if (which == -1) {
                List<String> list = this.$sportPermission;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!Intrinsics.areEqual((String) obj, "android.permission.ACTIVITY_RECOGNITION")) {
                        arrayList.add(obj);
                    }
                }
                SportPermissionsUtil sportPermissionsUtil = SportPermissionsUtil.INSTANCE;
                final FragmentActivity fragmentActivity = this.$activity;
                List<String> list2 = this.$sportPermissionDesc;
                final Function0<Unit> function0 = this.$launch;
                sportPermissionsUtil.requestPermissions(fragmentActivity, arrayList, list2, new Function0() { // from class: gsn
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SportPermissionsUtil.AnonymousClass2.onDialogClick$lambda$1(fragmentActivity, function0);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.utils.SportPermissionsUtil$requestBodyInfoPermission$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/sport_eco/utils/SportPermissionsUtil$requestBodyInfoPermission$2", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C31212 extends av6 {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Function0<Unit> $launch;
        final /* synthetic */ List<String> $sportPermission;
        final /* synthetic */ List<String> $sportPermissionDesc;

        public C31212(FragmentActivity fragmentActivity, List<String> list, List<String> list2, Function0<Unit> function0) {
            this.$activity = fragmentActivity;
            this.$sportPermission = list;
            this.$sportPermissionDesc = list2;
            this.$launch = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(Function0 launch) {
            Intrinsics.checkNotNullParameter(launch, "$launch");
            launch.invoke();
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which == -1) {
                SportPermissionsUtil sportPermissionsUtil = SportPermissionsUtil.INSTANCE;
                FragmentActivity fragmentActivity = this.$activity;
                List<String> list = this.$sportPermission;
                List<String> list2 = this.$sportPermissionDesc;
                final Function0<Unit> function0 = this.$launch;
                sportPermissionsUtil.requestPermissions(fragmentActivity, list, list2, new Function0() { // from class: hsn
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SportPermissionsUtil.C31212.onDialogClick$lambda$0(function0);
                    }
                });
            }
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    private SportPermissionsUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void afterLocationPermission(FragmentActivity activity, Function0<Unit> launch) {
        if (Build.VERSION.SDK_INT < 29) {
            launch.invoke();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ListExtKt.add(arrayList, "android.permission.ACTIVITY_RECOGNITION");
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (PermissionExtKt.isPermissionGranted(activity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            launch.invoke();
        } else {
            requestBodyInfoPermission(activity, arrayList, CollectionsKt__CollectionsJVMKt.listOf(ResourceExtKt.getString(e1j.A)), launch);
        }
    }

    private final void indoorPermission(List<String> sportPermission, List<String> sportPermissionDesc, FragmentActivity activity, Function0<Unit> launch) {
        requestBodyInfoPermission(activity, sportPermission, sportPermissionDesc, launch);
    }

    private final boolean isXiaoMiAlwaysAllow() {
        return !AppUtil.INSTANCE.isPlayChannel() && RomUtils.isXiaomi() && Build.VERSION.SDK_INT >= 29;
    }

    private final List<String> locationPermissionAlwaysAllow() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        return arrayList;
    }

    private final void outdoorPermission(List<String> sportPermission, List<String> sportPermissionDesc, final FragmentActivity activity, final Function0<Unit> launch) {
        List<String> list = sportPermission;
        String[] strArr = (String[]) list.toArray(new String[0]);
        boolean zIsPermissionGranted = PermissionExtKt.isPermissionGranted(activity, (String[]) Arrays.copyOf(strArr, strArr.length));
        String[] strArr2 = (String[]) list.toArray(new String[0]);
        List<String> listCheckPermissions = PermissionExtKt.checkPermissions(activity, (String[]) Arrays.copyOf(strArr2, strArr2.length));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listCheckPermissions) {
            if (true ^ Intrinsics.areEqual((String) obj, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                arrayList.add(obj);
            }
        }
        if (zIsPermissionGranted || arrayList.isEmpty()) {
            afterLocationPermission(activity, launch);
            return;
        }
        if (PermissionExtKt.isPermissionGranted(activity, "android.permission.ACCESS_FINE_LOCATION")) {
            return;
        }
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            requestPermissions(activity, sportPermission, sportPermissionDesc, new Function0() { // from class: yrn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportPermissionsUtil.outdoorPermission$lambda$5(activity, launch);
                }
            });
            return;
        }
        String string = ResourceExtKt.getString(e1j.A2);
        SpannableString spannableString = new SpannableString(string + "\n\r\n\r" + ResourceExtKt.getString(e1j.B2));
        spannableString.setSpan(new StyleSpan(1), 0, string.length(), 17);
        CommonDialog commonDialogCreate = new CommonDialog.c("sport").setDialogTitle(e1j.x0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableString)).setPositiveText(e1j.E).setNegativeText(e1j.Q2).create();
        if (commonDialogCreate != null) {
            commonDialogCreate.setCancelable(false);
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new AnonymousClass2(sportPermission, activity, sportPermissionDesc, launch));
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit outdoorPermission$lambda$5(FragmentActivity activity, Function0 launch) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(launch, "$launch");
        INSTANCE.afterLocationPermission(activity, launch);
        return Unit.INSTANCE;
    }

    private final void requestBodyInfoPermission(FragmentActivity activity, List<String> sportPermission, List<String> sportPermissionDesc, final Function0<Unit> launch) {
        String[] strArr = (String[]) sportPermission.toArray(new String[0]);
        if (PermissionExtKt.isPermissionGranted(activity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            launch.invoke();
            return;
        }
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            requestPermissions(activity, sportPermission, sportPermissionDesc, new Function0() { // from class: qrn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportPermissionsUtil.requestBodyInfoPermission$lambda$3(launch);
                }
            });
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("sport").setDialogTitle(e1j.f16162a).setDialogDescription(e1j.f16163b).setPositiveText(e1j.E).setNegativeText(e1j.Q2).create();
        if (commonDialogCreate != null) {
            commonDialogCreate.setCancelable(false);
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new C31212(activity, sportPermission, sportPermissionDesc, launch));
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestBodyInfoPermission$lambda$3(Function0 launch) {
        Intrinsics.checkNotNullParameter(launch, "$launch");
        launch.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationDialog$lambda$2(final PermissionBuilder pb, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: asn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportPermissionsUtil.requestLocationDialog$lambda$2$lambda$0(pb);
            }
        });
        permissions.denied(new Function1() { // from class: csn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportPermissionsUtil.requestLocationDialog$lambda$2$lambda$1(pb, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationDialog$lambda$2$lambda$0(PermissionBuilder pb) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        pb.getGranted().invoke2("android.permission.ACCESS_FINE_LOCATION");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationDialog$lambda$2$lambda$1(PermissionBuilder pb, List it) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        Intrinsics.checkNotNullParameter(it, "it");
        pb.getDenied().invoke2("android.permission.ACCESS_FINE_LOCATION");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestPermissions(final FragmentActivity activity, final List<String> sportPermission, List<String> sportPermissionDesc, final Function0<Unit> granted) {
        List<String> list = sportPermission;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (PermissionExtKt.isPermissionGranted(activity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            granted.invoke();
        } else {
            String[] strArr2 = (String[]) list.toArray(new String[0]);
            PermissionExtKt.permissions(activity, (String[]) Arrays.copyOf(strArr2, strArr2.length), (String[]) sportPermissionDesc.toArray(new String[0]), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: srn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportPermissionsUtil.requestPermissions$lambda$10(activity, sportPermission, granted, (MultiplePermissionsBuilder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissions$lambda$10(final FragmentActivity activity, final List sportPermission, final Function0 granted, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(sportPermission, "$sportPermission");
        Intrinsics.checkNotNullParameter(granted, "$granted");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.denied(new Function1() { // from class: urn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportPermissionsUtil.requestPermissions$lambda$10$lambda$8(activity, sportPermission, granted, (List) obj);
            }
        });
        permissions.allGranted(new Function0() { // from class: wrn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportPermissionsUtil.requestPermissions$lambda$10$lambda$9(granted);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissions$lambda$10$lambda$8(FragmentActivity activity, List sportPermission, Function0 granted, List it) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(sportPermission, "$sportPermission");
        Intrinsics.checkNotNullParameter(granted, "$granted");
        Intrinsics.checkNotNullParameter(it, "it");
        List list = sportPermission;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (PermissionExtKt.isPermissionDeniedForever(activity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            String[] strArr2 = (String[]) list.toArray(new String[0]);
            List<String> listCheckPermissionDeniedForever = PermissionExtKt.checkPermissionDeniedForever(activity, (String[]) Arrays.copyOf(strArr2, strArr2.length));
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listCheckPermissionDeniedForever, 10));
            boolean z = true;
            boolean z2 = true;
            for (String str : listCheckPermissionDeniedForever) {
                if (Intrinsics.areEqual(str, "android.permission.ACCESS_FINE_LOCATION")) {
                    z = false;
                }
                if (Intrinsics.areEqual(str, "android.permission.ACTIVITY_RECOGNITION")) {
                    z2 = false;
                }
                arrayList.add(Unit.INSTANCE);
            }
            FitnessLogUtils.i(TAG, "fineLocation : " + z + " , bodyInfoPermission : " + z2);
            if (!z || !z2) {
                CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(e1j.p2), Integer.valueOf(e1j.P1));
                return Unit.INSTANCE;
            }
        }
        String[] strArr3 = (String[]) list.toArray(new String[0]);
        List<String> listCheckPermissions = PermissionExtKt.checkPermissions(activity, (String[]) Arrays.copyOf(strArr3, strArr3.length));
        FitnessLogUtils.d(TAG, "checkPermissions");
        boolean zContains = listCheckPermissions.contains("android.permission.ACCESS_FINE_LOCATION");
        List<String> list2 = listCheckPermissions;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (String str2 : list2) {
            int iHashCode = str2.hashCode();
            Unit unit = null;
            if (iHashCode != -1888586689) {
                if (iHashCode != 1780337063) {
                    if (iHashCode == 2024715147 && str2.equals("android.permission.ACCESS_BACKGROUND_LOCATION") && !zContains) {
                        granted.invoke();
                    }
                } else if (str2.equals("android.permission.ACTIVITY_RECOGNITION")) {
                    SportPermissionsUtilKt.locationDialog(CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(e1j.u2), Integer.valueOf(e1j.O1)), activity);
                    unit = Unit.INSTANCE;
                }
            } else if (str2.equals("android.permission.ACCESS_FINE_LOCATION")) {
                SportPermissionsUtilKt.locationDialog(CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(e1j.p2), Integer.valueOf(e1j.P1)), activity);
                unit = Unit.INSTANCE;
            }
            arrayList2.add(unit);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissions$lambda$10$lambda$9(Function0 granted) {
        Intrinsics.checkNotNullParameter(granted, "$granted");
        granted.invoke();
        return Unit.INSTANCE;
    }

    private final void showLocationTipDialog(final FragmentActivity activity, final Function1<? super PermissionBuilder, Unit> extension) {
        String string = ResourceExtKt.getString(e1j.A2);
        SpannableString spannableString = new SpannableString(string + "\n\r\n\r" + ResourceExtKt.getString(e1j.B2));
        spannableString.setSpan(new StyleSpan(1), 0, string.length(), 17);
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(e1j.x0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableString)).setPositiveText(e1j.E).setNegativeText(e1j.Q2).create();
        commonDialogCreate.setCancelable(false);
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPermissionsUtil.showLocationTipDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    SportPermissionsUtil.INSTANCE.requestLocationDialog(activity, extension);
                }
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }

    public final void getSportPermissions(@NotNull final FragmentActivity activity, int sportType, @NotNull Function0<Unit> launch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(launch, "launch");
        if (!LocationExtKt.isGpsEnable(activity) && sportType != 3) {
            CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(e1j.E2).setPositiveText(e1j.w2).create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPermissionsUtil.getSportPermissions.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
            commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            ListExtKt.add(arrayList, "android.permission.ACCESS_FINE_LOCATION");
            ListExtKt.add(arrayList2, ResourceExtKt.getString(e1j.C));
            ListExtKt.add(arrayList, "android.permission.ACCESS_COARSE_LOCATION");
            ListExtKt.add(arrayList2, " ");
            outdoorPermission(arrayList, arrayList2, activity, launch);
            return;
        }
        if (sportType == 3 || sportType == 7) {
            ListExtKt.add(arrayList, "android.permission.ACTIVITY_RECOGNITION");
            ListExtKt.add(arrayList2, ResourceExtKt.getString(e1j.A));
            indoorPermission(arrayList, arrayList2, activity, launch);
            return;
        }
        if (i < 30) {
            ListExtKt.add(arrayList, "android.permission.ACCESS_FINE_LOCATION");
            ListExtKt.add(arrayList2, ResourceExtKt.getString(e1j.C));
            ListExtKt.add(arrayList, "android.permission.ACCESS_COARSE_LOCATION");
            ListExtKt.add(arrayList2, " ");
        } else {
            ListExtKt.add(arrayList, "android.permission.ACCESS_FINE_LOCATION");
            ListExtKt.add(arrayList2, ResourceExtKt.getString(e1j.C));
            ListExtKt.add(arrayList, "android.permission.ACCESS_COARSE_LOCATION");
            ListExtKt.add(arrayList2, " ");
            ListExtKt.add(arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION");
            ListExtKt.add(arrayList2, ResourceExtKt.getString(e1j.B));
        }
        outdoorPermission(arrayList, arrayList2, activity, launch);
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    public final void requestLocationDialog(@NotNull FragmentActivity activity, @NotNull Function1<? super PermissionBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(extension, "extension");
        List<String> listLocationPermissionAlwaysAllow = isXiaoMiAlwaysAllow() ? locationPermissionAlwaysAllow() : CollectionsKt__CollectionsJVMKt.listOf("android.permission.ACCESS_FINE_LOCATION");
        final PermissionBuilder permissionBuilder = new PermissionBuilder();
        extension.invoke2(permissionBuilder);
        String[] strArr = (String[]) listLocationPermissionAlwaysAllow.toArray(new String[0]);
        PermissionExtKt.permissions$default(activity, (String[]) Arrays.copyOf(strArr, strArr.length), (String[]) null, new Function1() { // from class: esn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportPermissionsUtil.requestLocationDialog$lambda$2(permissionBuilder, (MultiplePermissionsBuilder) obj);
            }
        }, 2, (Object) null);
    }

    public final void requestLocationIfNeed(@NotNull FragmentActivity activity, @NotNull Function1<? super PermissionBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (!PermissionExtKt.isPermissionGranted(activity, "android.permission.ACCESS_FINE_LOCATION")) {
            showLocationTipDialog(activity, extension);
            return;
        }
        PermissionBuilder permissionBuilder = new PermissionBuilder();
        extension.invoke2(permissionBuilder);
        permissionBuilder.getGranted().invoke2("android.permission.ACCESS_FINE_LOCATION");
    }
}
