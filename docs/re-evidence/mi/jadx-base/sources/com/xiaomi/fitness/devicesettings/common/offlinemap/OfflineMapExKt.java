package com.xiaomi.fitness.devicesettings.common.offlinemap;

import android.app.Application;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UriExtKt;
import com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.av6;
import defpackage.eui;
import defpackage.wzi;
import defpackage.z07;
import defpackage.zqi;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u001d\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001e\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010$\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%\u001a\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(\u001aC\u0010/\u001a\u00020\t2\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00002!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b-\u0012\b\b\u0015\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\t0+H\u0086@¢\u0006\u0004\b/\u00100\u001a\u0017\u00101\u001a\u0004\u0018\u00010,2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b1\u00102\u001a\u0015\u00103\u001a\u00020\u00002\u0006\u0010.\u001a\u00020,¢\u0006\u0004\b3\u00104\u001a\u0017\u00105\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0002¢\u0006\u0004\b5\u00106\u001a!\u00108\u001a\b\u0012\u0004\u0012\u00020\u00000\u001a2\f\u00107\u001a\b\u0012\u0004\u0012\u00020 0\u001a¢\u0006\u0004\b8\u00109\u001a1\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00000;2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001a¢\u0006\u0004\b<\u0010=\u001a/\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0>2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b?\u0010@\u001a)\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000>2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\bA\u0010@\u001a9\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010;2\u001a\u0010B\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010>2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\bC\u0010D\u001aC\u0010H\u001a\u0014\u0012\u0004\u0012\u00020F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000G0>2\u001a\u0010E\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010>2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\bH\u0010I\u001a\u0015\u0010J\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001a¢\u0006\u0004\bJ\u0010K\u001a3\u0010O\u001a\u00020\t2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010N\u001a\b\u0012\u0004\u0012\u00020 0M¢\u0006\u0004\bO\u0010P\u001a\u0015\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\bQ\u0010K\u001a\u0013\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00000\u001a¢\u0006\u0004\bR\u0010K\u001a\u001d\u0010T\u001a\u00020\u00022\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010;¢\u0006\u0004\bT\u0010U\u001a\u000f\u0010W\u001a\u0004\u0018\u00010V¢\u0006\u0004\bW\u0010X\u001a+\u0010\\\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020V2\u0006\u0010Z\u001a\u00020F2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00000;¢\u0006\u0004\b\\\u0010]\u001a%\u0010_\u001a\u00020\u00022\u0006\u0010^\u001a\u00020V2\u0006\u0010Z\u001a\u00020F2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b_\u0010`\u001a9\u0010d\u001a\b\u0012\u0004\u0012\u00020F0M2\u0006\u0010a\u001a\u00020\u00002\f\u0010b\u001a\b\u0012\u0004\u0012\u00020 0\u001a2\u000e\b\u0002\u0010c\u001a\b\u0012\u0004\u0012\u00020F0M¢\u0006\u0004\bd\u0010e\u001a/\u0010g\u001a\u00020\t2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020 0\u001a2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0+¢\u0006\u0004\bg\u0010h\u001a\u0015\u0010k\u001a\u00020j2\u0006\u0010i\u001a\u00020\u0000¢\u0006\u0004\bk\u0010l\u001aS\u0010o\u001a\u0014\u0012\u0004\u0012\u00020F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000G0>2\u0018\u0010m\u001a\u0014\u0012\u0004\u0012\u00020F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000G0>2\u0018\u0010n\u001a\u0014\u0012\u0004\u0012\u00020F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000G0>¢\u0006\u0004\bo\u0010p\u001a\u0015\u0010s\u001a\u00020\u00022\u0006\u0010r\u001a\u00020q¢\u0006\u0004\bs\u0010t\"\u0014\u0010u\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bu\u0010v\"\u0014\u0010w\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bw\u0010v\"\u0014\u0010x\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bx\u0010v¨\u0006y"}, d2 = {"", "adCode", "", "isHKOrMCOrTW", "(Ljava/lang/String;)Z", "districtName", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lkotlin/Function0;", "", "callBack", "showDeleteMapConfirmationDialogIfNeed", "(Ljava/lang/String;Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;)V", "showPhoneStorageLackDialog", "(Landroidx/fragment/app/FragmentManager;)V", "showDeviceStorageLackDialog", "currentFileSize", "checkDownload", "(Ljava/lang/String;Landroidx/fragment/app/FragmentManager;)Z", "showMobileNetDialog", "(Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;)V", "name", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "baseActivity", "showCancelDownloadDialog", "(Ljava/lang/String;Lcom/xiaomi/fitness/baseui/view/BaseActivity;Lkotlin/jvm/functions/Function0;)V", "", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/ADCodeItem;", "adCodeList", "fileName", "getAdCodeFromFileName", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictData;", "districtData", "Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycleCoroutineScope", "downloadDistrict", "(Ljava/lang/String;Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictData;Landroidx/lifecycle/LifecycleCoroutineScope;)V", "Ljava/io/File;", "getDistrictLibFile", "()Ljava/io/File;", "outputFile", "srcUrl", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", SportRecordBundleKey.BUNDLE_PARAM_URI, "downloadFile", "(Ljava/io/File;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUriFromFileName", "(Ljava/lang/String;)Landroid/net/Uri;", "readFromUri", "(Landroid/net/Uri;)Ljava/lang/String;", "getResourceFilePath", "(Ljava/lang/String;)Ljava/lang/String;", "districtList", "getAdCodeListFromDistrict", "(Ljava/util/List;)Ljava/util/List;", "adCode2FileList", "", "getFileNameListFromAdCode", "(Ljava/util/List;Ljava/util/List;)Ljava/util/Set;", "", "convertAdCode2FileListToMap", "(Ljava/util/List;)Ljava/util/Map;", "convertAdCodeToFileListToFileNameAdCodeMap", "adCode2FileListLib", "getFileNameInZoom16FromAdCode", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Set;", "adCode2FileListMap", "", "", "getHierarchicalFileNameSetMapFromAdCode", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "loadDistrictLib", "()Ljava/util/List;", "districtDataList", "", "list", "getDistrictDataFromAdCode", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "loadADCode2File", "loadInstalledMapFile", "fileNameList", "checkAllFileNameExistInZoom16", "(Ljava/util/Set;)Z", "Lz07;", "getMapDocumentFile", "()Lz07;", "map", "zoomLevel", "fileNameSet", "deleteFilesInAZoomLevel", "(Lz07;ILjava/util/Set;)Z", "zoomLevelDir", "deleteFileByFileName", "(Lz07;ILjava/lang/String;)Z", "adcode", "districts", "levelValues", "findAdcodeIndex", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "action", "foreachDistricts", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "sizeString", "", "districtSizeConvert", "(Ljava/lang/String;)J", "itemMap", "otherMap", "getSubtractMap", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DownloadStatus;", "status", "isProcessingStatus", "(Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DownloadStatus;)Z", "GDP_SUFFIX", "Ljava/lang/String;", "DISTRICTS_FILE", "ADCODE_2_FILE", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOfflineMapEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfflineMapEx.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapExKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,593:1\n295#2,2:594\n1557#2:596\n1628#2,3:597\n1863#2:600\n774#2:601\n865#2,2:602\n1557#2:604\n1628#2,3:605\n1864#2:608\n1863#2,2:609\n1863#2,2:611\n774#2:613\n865#2,2:614\n1863#2,2:616\n1557#2:618\n1628#2,3:619\n1863#2,2:622\n1863#2,2:625\n1557#2:629\n1628#2,3:630\n1863#2:633\n1557#2:634\n1628#2,3:635\n1864#2:638\n1863#2,2:639\n1872#2,3:641\n1863#2,2:644\n1863#2,2:646\n1#3:624\n13402#4,2:627\n*S KotlinDebug\n*F\n+ 1 OfflineMapEx.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapExKt\n*L\n202#1:594,2\n284#1:596\n284#1:597,3\n291#1:600\n292#1:601\n292#1:602,2\n293#1:604\n293#1:605,3\n291#1:608\n301#1:609,2\n314#1:611,2\n328#1:613\n328#1:614,2\n330#1:616,2\n334#1:618\n334#1:619,3\n351#1:622,2\n382#1:625,2\n428#1:629\n428#1:630,3\n443#1:633\n444#1:634\n444#1:635,3\n443#1:638\n462#1:639,2\n507#1:641,3\n526#1:644,2\n554#1:646,2\n421#1:627,2\n*E\n"})
public final class OfflineMapExKt {

    @NotNull
    public static final String ADCODE_2_FILE = "Adcode2File-0312-simplify.json";

    @NotNull
    public static final String DISTRICTS_FILE = "districts.json";

    @NotNull
    public static final String GDP_SUFFIX = ".gdp";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt$downloadDistrict$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt$downloadDistrict$1", f = "OfflineMapEx.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $adCode;
        final /* synthetic */ DistrictData $districtData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, DistrictData districtData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$adCode = str;
            this.$districtData = districtData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$adCode, this.$districtData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OfflineMapDownloadManager offlineMapDownloadManager = OfflineMapDownloadManager.INSTANCE;
                String str = this.$adCode;
                final DistrictData districtData = this.$districtData;
                DownloadUrlCallBack downloadUrlCallBack = new DownloadUrlCallBack() { // from class: com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt.downloadDistrict.1.1
                    @Override // com.xiaomi.fitness.devicesettings.common.offlinemap.DownloadUrlCallBack
                    public void onFailed(String msg) {
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        ToastUtil.showToast(msg);
                        FitnessLogUtils.i(RegionListFragment.TAG, "failed msg:" + msg);
                    }

                    @Override // com.xiaomi.fitness.devicesettings.common.offlinemap.DownloadUrlCallBack
                    public void onSuccess(DistrictUrlData districtUrlData) {
                        Intrinsics.checkNotNullParameter(districtUrlData, "districtUrlData");
                        FitnessLogUtils.i(RegionListFragment.TAG, "Download url:" + districtUrlData.getUrl());
                        Uri uri = Uri.parse(districtUrlData.getUrl());
                        OfflineMapDownloadManager offlineMapDownloadManager2 = OfflineMapDownloadManager.INSTANCE;
                        Intrinsics.checkNotNull(uri);
                        offlineMapDownloadManager2.startDownload(uri, districtData);
                    }
                };
                this.label = 1;
                if (offlineMapDownloadManager.getDownloadUrlByAdCode(str, downloadUrlCallBack, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt$downloadFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt", f = "OfflineMapEx.kt", i = {0, 0, 0}, l = {244}, m = "downloadFile", n = {"outputFile", "srcUrl", "callBack"}, s = {"L$0", "L$1", "L$2"})
    public static final class C21461 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C21461(Continuation<? super C21461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OfflineMapExKt.downloadFile(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt$downloadFile$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ljava/io/InputStream;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt$downloadFile$2", f = "OfflineMapEx.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InputStream>, Object> {
        final /* synthetic */ String $srcUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$srcUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$srcUrl, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new URL(this.$srcUrl).openStream();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InputStream> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final boolean checkAllFileNameExistInZoom16(@Nullable Set<String> set) {
        z07 z07VarE;
        z07 z07VarE2;
        if (set == null || set.isEmpty()) {
            Logger.i(RegionListFragment.TAG, "checkAllFileNameExist fileNameList is null or empty.");
            return false;
        }
        if (SettingsPageUtilExtKt.getOffline_map_storage_dir_uri() == null) {
            return false;
        }
        Application application = ApplicationExtKt.getApplication();
        Uri offline_map_storage_dir_uri = SettingsPageUtilExtKt.getOffline_map_storage_dir_uri();
        Intrinsics.checkNotNull(offline_map_storage_dir_uri);
        z07 z07VarH = z07.h(application, offline_map_storage_dir_uri);
        if (z07VarH == null || (z07VarE = z07VarH.e("map")) == null || (z07VarE2 = z07VarE.e("16")) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        z07[] z07VarArrM = z07VarE2.m();
        Intrinsics.checkNotNullExpressionValue(z07VarArrM, "listFiles(...)");
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, z07VarArrM);
        int i = 0;
        for (String str : set) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((z07) it.next()).i());
            }
            if (arrayList2.contains(str)) {
                i++;
            }
        }
        Logger.i(RegionListFragment.TAG, "checkAllFileNameExist hitCount=" + i + " fileNameList size=" + set.size());
        return set.size() == i;
    }

    public static final boolean checkDownload(@NotNull String currentFileSize, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(currentFileSize, "currentFileSize");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        long jDistrictSizeConvert = districtSizeConvert(currentFileSize);
        if (jDistrictSizeConvert >= availableBlocksLong) {
            showPhoneStorageLackDialog(fragmentManager);
            return false;
        }
        if (jDistrictSizeConvert < OfflineMapDownloadManager.INSTANCE.getDeviceAvailableSize()) {
            return true;
        }
        showDeviceStorageLackDialog(fragmentManager);
        return false;
    }

    @NotNull
    public static final Map<String, List<ADCodeItem>> convertAdCode2FileListToMap(@Nullable List<ADCodeItem> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (ADCodeItem aDCodeItem : list) {
                List arrayList = (List) linkedHashMap.get(aDCodeItem.getAdcode());
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ListExtKt.add(arrayList, aDCodeItem);
                linkedHashMap.put(aDCodeItem.getAdcode(), arrayList);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Map<String, String> convertAdCodeToFileListToFileNameAdCodeMap(@Nullable List<ADCodeItem> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (ADCodeItem aDCodeItem : list) {
                linkedHashMap.put(aDCodeItem.getMinX() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem.getMinY() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem.getMaxX() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem.getMaxY() + GDP_SUFFIX, aDCodeItem.getAdcode());
            }
        }
        return linkedHashMap;
    }

    public static final boolean deleteFileByFileName(@NotNull z07 zoomLevelDir, int i, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(zoomLevelDir, "zoomLevelDir");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        z07 z07VarE = zoomLevelDir.e(fileName);
        Logger.i(RegionListFragment.TAG, "deleteFileByFileName target=" + z07VarE + " targeExist=" + (z07VarE != null ? Boolean.valueOf(z07VarE.d()) : null));
        if (z07VarE == null || !z07VarE.d()) {
            Logger.i(RegionListFragment.TAG, "deleteFileByFileName targetFile NOT FOUND.");
            return true;
        }
        Logger.i(RegionListFragment.TAG, "deleteFileByFileName fileName=" + fileName + " zoomLevel=" + i);
        try {
            z07VarE.c();
            Logger.i(RegionListFragment.TAG, "deleteFileByFileName target is successfully deleted.");
            return true;
        } catch (Exception e) {
            Logger.i(RegionListFragment.TAG, "deleteFileByFileName failed. error=" + e);
            return false;
        }
    }

    public static final boolean deleteFilesInAZoomLevel(@NotNull z07 map, int i, @NotNull Set<String> fileNameSet) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fileNameSet, "fileNameSet");
        z07 z07VarE = map.e(String.valueOf(i));
        if (z07VarE == null) {
            return true;
        }
        Iterator<T> it = fileNameSet.iterator();
        while (it.hasNext()) {
            if (!deleteFileByFileName(z07VarE, i, (String) it.next())) {
                return false;
            }
        }
        Logger.i(RegionListFragment.TAG, "deleteFilesInAZoomLevel zoomLevel=" + i + " fileNameSet size=" + fileNameSet.size());
        return true;
    }

    public static final long districtSizeConvert(@NotNull String sizeString) {
        long j;
        long j2;
        Intrinsics.checkNotNullParameter(sizeString, "sizeString");
        try {
            if (StringsKt__StringsJVMKt.endsWith$default(sizeString, ServerConstants.GB_COUNTRY_CODE, false, 2, null)) {
                String strSubstring = sizeString.substring(0, StringsKt__StringsKt.indexOf$default((CharSequence) sizeString, "G", 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                j = Long.parseLong(strSubstring);
                j2 = 1073741824;
            } else {
                if (!StringsKt__StringsJVMKt.endsWith$default(sizeString, "MB", false, 2, null)) {
                    return 0L;
                }
                String strSubstring2 = sizeString.substring(0, StringsKt__StringsKt.indexOf$default((CharSequence) sizeString, "M", 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                j = Long.parseLong(strSubstring2);
                j2 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return j * j2;
        } catch (Exception e) {
            Logger.i(RegionListFragment.TAG, "district size invalid e:" + e);
            return 0L;
        }
    }

    public static final void downloadDistrict(@NotNull String adCode, @NotNull DistrictData districtData, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        Intrinsics.checkNotNullParameter(adCode, "adCode");
        Intrinsics.checkNotNullParameter(districtData, "districtData");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, Dispatchers.getIO(), null, new AnonymousClass1(adCode, districtData, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object downloadFile(@NotNull File file, @NotNull String str, @NotNull Function1<? super Uri, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        C21461 c21461;
        if (continuation instanceof C21461) {
            c21461 = (C21461) continuation;
            int i = c21461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21461.label = i - Integer.MIN_VALUE;
            } else {
                c21461 = new C21461(continuation);
            }
        } else {
            c21461 = new C21461(continuation);
        }
        Object objWithContext = c21461.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c21461.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(str, null);
            c21461.L$0 = file;
            c21461.L$1 = str;
            c21461.L$2 = function1;
            c21461.label = 1;
            objWithContext = BuildersKt.withContext(io2, anonymousClass2, c21461);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) c21461.L$2;
            str = (String) c21461.L$1;
            file = (File) c21461.L$0;
            ResultKt.throwOnFailure(objWithContext);
        }
        Closeable closeable = (Closeable) objWithContext;
        try {
            InputStream inputStream = (InputStream) closeable;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                Intrinsics.checkNotNull(inputStream);
                ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                String strGuessFileName = URLUtil.guessFileName(str, null, null);
                Intrinsics.checkNotNull(strGuessFileName);
                Uri uriFromFileName = getUriFromFileName(strGuessFileName);
                if (uriFromFileName == null) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(closeable, null);
                    return unit;
                }
                function1.invoke2(uriFromFileName);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                CloseableKt.closeFinally(closeable, null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(closeable, th3);
                throw th4;
            }
        }
    }

    @NotNull
    public static final List<Integer> findAdcodeIndex(@NotNull String adcode, @NotNull List<DistrictData> districts, @NotNull List<Integer> levelValues) {
        Intrinsics.checkNotNullParameter(adcode, "adcode");
        Intrinsics.checkNotNullParameter(districts, "districts");
        Intrinsics.checkNotNullParameter(levelValues, "levelValues");
        int i = 0;
        for (Object obj : districts) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            DistrictData districtData = (DistrictData) obj;
            if (adcode.equals(districtData.getAdcode())) {
                levelValues.add(Integer.valueOf(i));
                return levelValues;
            }
            List<DistrictData> districts2 = districtData.getDistricts();
            if (districts2 != null && !districts2.isEmpty()) {
                levelValues.add(Integer.valueOf(i));
                List<Integer> listFindAdcodeIndex = findAdcodeIndex(adcode, districtData.getDistricts(), levelValues);
                if (!listFindAdcodeIndex.isEmpty()) {
                    return listFindAdcodeIndex;
                }
                levelValues.clear();
            }
            i = i2;
        }
        return new ArrayList();
    }

    public static /* synthetic */ List findAdcodeIndex$default(String str, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = new ArrayList();
        }
        return findAdcodeIndex(str, list, list2);
    }

    public static final void foreachDistricts(@NotNull List<DistrictData> districts, @NotNull Function1<? super DistrictData, Unit> action) {
        Intrinsics.checkNotNullParameter(districts, "districts");
        Intrinsics.checkNotNullParameter(action, "action");
        for (DistrictData districtData : districts) {
            action.invoke2(districtData);
            List<DistrictData> districts2 = districtData.getDistricts();
            if (districts2 != null) {
                foreachDistricts(districts2, action);
            }
        }
    }

    @Nullable
    public static final String getAdCodeFromFileName(@Nullable List<ADCodeItem> list, @NotNull String fileName) {
        ADCodeItem aDCodeItem;
        Object next;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Logger.i(RegionListFragment.TAG, "getAdCodeListFromFileName fileName endsWith=" + StringsKt__StringsJVMKt.endsWith$default(fileName, GDP_SUFFIX, false, 2, null));
        if (!StringsKt__StringsJVMKt.endsWith$default(fileName, GDP_SUFFIX, false, 2, null)) {
            return "";
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.split$default((CharSequence) fileName, new String[]{"."}, false, 0, 6, (Object) null).get(0), new String[]{RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR}, false, 0, 6, (Object) null);
        int i = Integer.parseInt((String) listSplit$default.get(0));
        int i2 = Integer.parseInt((String) listSplit$default.get(1));
        int i3 = Integer.parseInt((String) listSplit$default.get(2));
        int i4 = Integer.parseInt((String) listSplit$default.get(3));
        Logger.i(RegionListFragment.TAG, "getAdCodeListFromFileName minX=" + i + " minY=" + i2 + " maxX=" + i3 + " maxY=" + i4);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ADCodeItem aDCodeItem2 = (ADCodeItem) next;
                if (aDCodeItem2.getMinX() == i && aDCodeItem2.getMinY() == i2 && aDCodeItem2.getMaxX() == i3 && aDCodeItem2.getMaxY() == i4) {
                    break;
                }
            }
            aDCodeItem = (ADCodeItem) next;
        } else {
            aDCodeItem = null;
        }
        if (aDCodeItem != null) {
            return aDCodeItem.getAdcode();
        }
        return null;
    }

    @NotNull
    public static final List<String> getAdCodeListFromDistrict(@NotNull List<DistrictData> districtList) {
        Intrinsics.checkNotNullParameter(districtList, "districtList");
        List<DistrictData> list = districtList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DistrictData) it.next()).getAdcode());
        }
        return arrayList;
    }

    public static final void getDistrictDataFromAdCode(@Nullable List<DistrictData> list, @NotNull String adCode, @NotNull List<DistrictData> list2) {
        Intrinsics.checkNotNullParameter(adCode, "adCode");
        Intrinsics.checkNotNullParameter(list2, "list");
        if (list != null) {
            for (DistrictData districtData : list) {
                List<DistrictData> districts = districtData.getDistricts();
                if (districts != null && !districts.isEmpty()) {
                    getDistrictDataFromAdCode(districtData.getDistricts(), adCode, list2);
                } else if (Intrinsics.areEqual(districtData.getAdcode(), adCode)) {
                    list2.add(districtData);
                }
            }
        }
    }

    @NotNull
    public static final File getDistrictLibFile() {
        return new File(getResourceFilePath("district_lib.json"));
    }

    @Nullable
    public static final Set<String> getFileNameInZoom16FromAdCode(@Nullable Map<String, List<ADCodeItem>> map, @NotNull String adCode) {
        ArrayList<ADCodeItem> arrayList;
        List<ADCodeItem> list;
        Intrinsics.checkNotNullParameter(adCode, "adCode");
        if (map == null || (list = map.get(adCode)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ADCodeItem) obj).getZoom() == 16) {
                    arrayList.add(obj);
                }
            }
        }
        Logger.i(RegionListFragment.TAG, "getFileNameFromAdCode item=" + arrayList);
        if (arrayList != null) {
            for (ADCodeItem aDCodeItem : arrayList) {
                Logger.i(RegionListFragment.TAG, "getFileNameFromAdCode fileName=" + (aDCodeItem.getMinX() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem.getMinY() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem.getMaxX() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem.getMaxY() + GDP_SUFFIX));
            }
        }
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ADCodeItem aDCodeItem2 : arrayList) {
            arrayList2.add(aDCodeItem2.getMinX() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem2.getMinY() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem2.getMaxX() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem2.getMaxY() + GDP_SUFFIX);
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList2);
    }

    @NotNull
    public static final Set<String> getFileNameListFromAdCode(@Nullable List<ADCodeItem> list, @NotNull List<String> adCodeList) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(adCodeList, "adCodeList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : adCodeList) {
            if (list != null) {
                ArrayList<ADCodeItem> arrayList2 = new ArrayList();
                for (Object obj : list) {
                    ADCodeItem aDCodeItem = (ADCodeItem) obj;
                    if (Intrinsics.areEqual(aDCodeItem.getAdcode(), str) && aDCodeItem.getZoom() == 16) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                for (ADCodeItem aDCodeItem2 : arrayList2) {
                    arrayList.add(aDCodeItem2.getMaxX() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem2.getMaxY() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem2.getMinX() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem2.getMinY() + GDP_SUFFIX);
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                linkedHashSet.addAll(arrayList);
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static final Map<Integer, Set<String>> getHierarchicalFileNameSetMapFromAdCode(@Nullable Map<String, List<ADCodeItem>> map, @NotNull String adCode) {
        Intrinsics.checkNotNullParameter(adCode, "adCode");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<ADCodeItem> list = map != null ? map.get(adCode) : null;
        if (list != null) {
            for (ADCodeItem aDCodeItem : list) {
                String str = aDCodeItem.getMinX() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem.getMinY() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem.getMaxX() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aDCodeItem.getMaxY() + GDP_SUFFIX;
                int zoom = aDCodeItem.getZoom();
                Logger.i(RegionListFragment.TAG, "getHierarchicalFileNameListFromAdCode fileName=" + str);
                Set linkedHashSet = (Set) linkedHashMap.get(Integer.valueOf(zoom));
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(str);
                linkedHashMap.put(Integer.valueOf(zoom), linkedHashSet);
            }
        }
        return linkedHashMap;
    }

    @Nullable
    public static final z07 getMapDocumentFile() {
        z07 z07VarE;
        Logger.i(RegionListFragment.TAG, "deleteFileByFileName offline_map_storage_dir_uri=" + SettingsPageUtilExtKt.getOffline_map_storage_dir_uri());
        if (SettingsPageUtilExtKt.getOffline_map_storage_dir_uri() == null) {
            return null;
        }
        Application application = ApplicationExtKt.getApplication();
        Uri offline_map_storage_dir_uri = SettingsPageUtilExtKt.getOffline_map_storage_dir_uri();
        Intrinsics.checkNotNull(offline_map_storage_dir_uri);
        z07 z07VarH = z07.h(application, offline_map_storage_dir_uri);
        Logger.i(RegionListFragment.TAG, "deleteFileByFileName root=" + z07VarH);
        if (z07VarH == null || (z07VarE = z07VarH.e("map")) == null) {
            return null;
        }
        return z07VarE;
    }

    private static final String getResourceFilePath(String str) {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("offlineMap");
        return (externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + File.separator + str;
    }

    @NotNull
    public static final Map<Integer, Set<String>> getSubtractMap(@NotNull Map<Integer, Set<String>> itemMap, @NotNull Map<Integer, Set<String>> otherMap) {
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        Intrinsics.checkNotNullParameter(otherMap, "otherMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = SetsKt__SetsKt.setOf((Object[]) new Integer[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Set<String> linkedHashSet = itemMap.get(Integer.valueOf(iIntValue));
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
            }
            Set<String> linkedHashSet2 = otherMap.get(Integer.valueOf(iIntValue));
            if (linkedHashSet2 == null) {
                linkedHashSet2 = new LinkedHashSet<>();
            }
            Set mutableSet = CollectionsKt___CollectionsKt.toMutableSet(SetsKt___SetsKt.minus((Set) linkedHashSet, (Iterable) linkedHashSet2));
            if (!mutableSet.isEmpty()) {
                linkedHashMap.put(Integer.valueOf(iIntValue), mutableSet);
            }
        }
        return linkedHashMap;
    }

    @Nullable
    public static final Uri getUriFromFileName(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Uri uriFromFile = Uri.fromFile(new File(getResourceFilePath(fileName)));
        Intrinsics.checkNotNull(uriFromFile);
        return UriExtKt.convertToSafeUriAboveN(uriFromFile);
    }

    public static final boolean isHKOrMCOrTW(@NotNull String adCode) {
        Intrinsics.checkNotNullParameter(adCode, "adCode");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"810000", "820000", "710000"}).contains(adCode);
    }

    public static final boolean isProcessingStatus(@NotNull DownloadStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return status == DownloadStatus.STATUS_DOWNLOADING || status == DownloadStatus.STATUS_INSTALLING || status == DownloadStatus.STATUS_PENDING;
    }

    @Nullable
    public static final List<ADCodeItem> loadADCode2File() {
        BufferedReader bufferedReader;
        String text;
        Exception e;
        List<ADCodeItem> list;
        InputStream inputStreamOpen;
        AssetManager assets = ApplicationExtKt.getApplication().getAssets();
        if (assets == null || (inputStreamOpen = assets.open(ADCODE_2_FILE)) == null) {
            bufferedReader = null;
        } else {
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        }
        if (bufferedReader != null) {
            try {
                text = TextStreamsKt.readText(bufferedReader);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader, th);
                    throw th2;
                }
            }
        } else {
            text = null;
        }
        CloseableKt.closeFinally(bufferedReader, null);
        try {
            list = (List) new Gson().fromJson(text, new TypeToken<List<? extends ADCodeItem>>() { // from class: com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt.loadADCode2File.1
            }.getType());
            try {
                Logger.d(RegionListFragment.TAG, "loadADCode2File result=" + list);
            } catch (Exception e2) {
                e = e2;
                Logger.i(RegionListFragment.TAG, "loadADCode2File failed. e=" + e);
            }
        } catch (Exception e3) {
            e = e3;
            list = null;
        }
        return list;
    }

    @Nullable
    public static final List<DistrictData> loadDistrictLib() {
        BufferedReader bufferedReader;
        String text;
        Exception e;
        List<DistrictData> list;
        InputStream inputStreamOpen;
        AssetManager assets = ApplicationExtKt.getApplication().getAssets();
        if (assets == null || (inputStreamOpen = assets.open("districts.json")) == null) {
            bufferedReader = null;
        } else {
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        }
        if (bufferedReader != null) {
            try {
                text = TextStreamsKt.readText(bufferedReader);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader, th);
                    throw th2;
                }
            }
        } else {
            text = null;
        }
        CloseableKt.closeFinally(bufferedReader, null);
        try {
            list = (List) new Gson().fromJson(text, new TypeToken<List<? extends DistrictData>>() { // from class: com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt.loadDistrictLib.1
            }.getType());
            try {
                Logger.d(RegionListFragment.TAG, "loadDistrictLib list=" + list);
            } catch (Exception e2) {
                e = e2;
                Logger.i(RegionListFragment.TAG, "loadDistrictLib failed. e=" + e);
            }
        } catch (Exception e3) {
            e = e3;
            list = null;
        }
        return list;
    }

    @NotNull
    public static final List<String> loadInstalledMapFile() {
        if (SettingsPageUtilExtKt.getOffline_map_storage_dir_uri() == null) {
            return new ArrayList();
        }
        Application application = ApplicationExtKt.getApplication();
        Uri offline_map_storage_dir_uri = SettingsPageUtilExtKt.getOffline_map_storage_dir_uri();
        Intrinsics.checkNotNull(offline_map_storage_dir_uri);
        z07 z07VarH = z07.h(application, offline_map_storage_dir_uri);
        Logger.i(RegionListFragment.TAG, "loadInstalledMapFile Target uri:" + SettingsPageUtilExtKt.getOffline_map_storage_dir_uri() + ",root path:" + (z07VarH != null ? z07VarH.i() : null));
        Logger.i(RegionListFragment.TAG, "loadInstalledMapFile isDir=" + (z07VarH != null ? Boolean.valueOf(z07VarH.l()) : null));
        Intrinsics.checkNotNull(z07VarH);
        z07[] z07VarArrM = z07VarH.m();
        Intrinsics.checkNotNullExpressionValue(z07VarArrM, "listFiles(...)");
        for (z07 z07Var : z07VarArrM) {
            Logger.i(RegionListFragment.TAG, "loadInstalledMapFile child:" + z07Var.k() + "  name:" + z07Var.i());
        }
        z07 z07VarE = z07VarH.e("map");
        if (z07VarE == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        z07[] z07VarArrM2 = z07VarE.m();
        Intrinsics.checkNotNullExpressionValue(z07VarArrM2, "listFiles(...)");
        for (z07 z07Var2 : z07VarArrM2) {
            Logger.i(RegionListFragment.TAG, "loadInstalledMapFile file name=" + z07Var2.i() + " uri=" + z07Var2.k() + " type=$" + z07Var2.j());
        }
        z07 z07VarE2 = z07VarE.e("16");
        if (z07VarE2 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        z07[] z07VarArrM3 = z07VarE2.m();
        Intrinsics.checkNotNullExpressionValue(z07VarArrM3, "listFiles(...)");
        List list = ArraysKt___ArraysKt.toList(z07VarArrM3);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strI = ((z07) it.next()).i();
            if (strI == null) {
                strI = "empty";
            }
            arrayList.add(strI);
        }
        return arrayList;
    }

    @NotNull
    public static final String readFromUri(@NotNull Uri uri) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        StringBuilder sb = new StringBuilder();
        InputStream inputStreamOpenInputStream = ApplicationExtKt.getApplication().getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream));
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        sb.append(line);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedReader, null);
                    CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final void showCancelDownloadDialog(@NotNull String name, @NotNull BaseActivity baseActivity, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        View viewInflate = LayoutInflater.from(baseActivity).inflate(eui.n2, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        final CommonDialog commonDialogCreate = new CommonDialog.c("offline_map_cancel_task").setCustomView(viewInflate).create();
        TextView textView = (TextView) viewInflate.findViewById(zqi.l0);
        TextView textView2 = (TextView) viewInflate.findViewById(zqi.k0);
        TextView textView3 = (TextView) viewInflate.findViewById(zqi.g0);
        textView.setText(name);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: m6h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineMapExKt.showCancelDownloadDialog$lambda$0(callBack, commonDialogCreate, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: n6h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                commonDialogCreate.dismiss();
            }
        });
        commonDialogCreate.showIfNeed(baseActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCancelDownloadDialog$lambda$0(Function0 callBack, CommonDialog commonDialog, View view) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        callBack.invoke();
        commonDialog.dismiss();
    }

    public static final void showDeleteMapConfirmationDialogIfNeed(@NotNull String districtName, @NotNull FragmentManager fragmentManager, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(districtName, "districtName");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        CommonDialog commonDialogCreate = new CommonDialog.c("returnCardUserInfo").setDialogTitle(wzi.t5).setNegativeText(wzi.e).setPositiveText(wzi.g).setDialogDescriptionString(new DialogParams.DialogDescriptionString(ResourceExtKt.getString(wzi.T2, districtName))).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt.showDeleteMapConfirmationDialogIfNeed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    callBack.invoke();
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
    }

    public static final void showDeviceStorageLackDialog(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        new CommonDialog.c("device_storage_lack").setDialogTitle(wzi.Ze).setDialogDescription(wzi.Ye).setPositiveText(wzi.common_known).create().showIfNeed(fragmentManager);
    }

    public static final void showMobileNetDialog(@NotNull FragmentManager fragmentManager, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        new CommonDialog.c("ask_net_allow").setDialogTitle(wzi.Xe).setDialogDescription(wzi.We).setPositiveText(wzi.g).setNegativeText(wzi.e).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapExKt$showMobileNetDialog$dialog$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    callBack.invoke();
                } else if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(fragmentManager);
    }

    public static final void showPhoneStorageLackDialog(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        new CommonDialog.c("phone_storage_lack").setDialogTitle(wzi.bf).setDialogDescription(wzi.af).setPositiveText(wzi.common_known).create().showIfNeed(fragmentManager);
    }
}
