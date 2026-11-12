package com.huami.devicerecorder.viewmodel;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicerecorder.model.ExtKt;
import com.huami.devicerecorder.model.LiveDataExKt;
import com.huami.devicerecorder.model.PageMode;
import com.huami.devicerecorder.model.PlayItemData;
import com.huami.devicerecorder.model.RecordFile;
import com.huami.devicerecorder.repository.IRecordRepo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 <2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000eJ\u0006\u0010\u001e\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0013J\u0016\u0010\"\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0013J\u0006\u0010#\u001a\u00020\u0002R%\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0$8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020,0$8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b-\u0010'R'\u00103\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010/0/0$8\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e0)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010*R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Lcom/huami/devicerecorder/viewmodel/RecorderFileListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/devicerecorder/model/PlayItemData;", "itemData", "a", "b", "Lcom/huami/devicerecorder/repository/IRecordRepo;", CommonLanguageSettingFragment.KEY_REPO, "setup", "getRecorderFiles", "", "Lcom/huami/devicerecorder/model/RecordFile;", "getSelected", "getWantToSyncFile$device_recorder_release", "()Ljava/util/List;", "getWantToSyncFile", "", "cache", "cacheSelected$device_recorder_release", "(Z)V", "cacheSelected", "resetSelected$device_recorder_release", "()V", "resetSelected", "deleteRecorderFile", "recordFile", "addLocalRecorderFile", "changeMode", Status.PRE_CONNECT_STATE_CONNECTED, "onDeviceConnect", "select", "selectItem", "triggerClear", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getRecordFilesLiveData", "()Landroidx/lifecycle/MutableLiveData;", "recordFilesLiveData", "", "Ljava/util/List;", "recordItems", "Lcom/huami/devicerecorder/model/PageMode;", "getPageModeLiveData", "pageModeLiveData", "", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "getSelectedCountLiveData", "selectedCountLiveData", "e", "wantSyncFiles", "f", "Lcom/huami/devicerecorder/repository/IRecordRepo;", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "g", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class RecorderFileListViewModel extends AndroidViewModel {

    @Deprecated
    @NotNull
    public static final String TAG = "RecorderFileListViewModel";

    @NotNull
    private static final a g = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<PlayItemData>> recordFilesLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<PlayItemData> recordItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PageMode> pageModeLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> selectedCountLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final List<RecordFile> wantSyncFiles;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private IRecordRepo repo;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PageMode.values().length];
            iArr[PageMode.Normal.ordinal()] = 1;
            iArr[PageMode.Transport.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/devicerecorder/viewmodel/RecorderFileListViewModel$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "add local recorder file failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ PageMode a;
        public final /* synthetic */ PageMode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PageMode pageMode, PageMode pageMode2) {
            super(0);
            this.a = pageMode;
            this.b = pageMode2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            PageMode pageMode = this.a;
            String strName = pageMode == null ? null : pageMode.name();
            PageMode pageMode2 = this.b;
            return "change mode frome: " + strName + " to " + (pageMode2 != null ? pageMode2.name() : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ PlayItemData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PlayItemData playItemData) {
            super(0);
            this.a = playItemData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete failed: " + this.a.getRecordFile();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleFileNotExit failed all files is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.devicerecorder.viewmodel.RecorderFileListViewModel", f = "RecorderFileListViewModel.kt", i = {0}, l = {43}, m = "loadRecordFiles", n = {"this"}, s = {"L$0"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return RecorderFileListViewModel.this.c(this);
        }
    }

    public RecorderFileListViewModel(@NotNull Application application) {
        super(application);
        this.recordFilesLiveData = new MutableLiveData<>();
        this.recordItems = new ArrayList();
        MutableLiveData<PageMode> mutableLiveData = new MutableLiveData<>();
        this.pageModeLiveData = mutableLiveData;
        this.selectedCountLiveData = new MutableLiveData<>(0);
        this.wantSyncFiles = new ArrayList();
        mutableLiveData.setValue(PageMode.Normal);
    }

    private final void a(PlayItemData itemData) {
    }

    private final void b(PlayItemData itemData) {
        List<PlayItemData> value = this.recordFilesLiveData.getValue();
        if (value == null) {
            HMLog.info(TAG, e.a);
            return;
        }
        itemData.setPosition(0);
        itemData.setPlaying(false);
        itemData.getRecordFile().setValid(false);
        this.recordFilesLiveData.setValue(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Continuation<? super Unit> continuation) {
        f fVar;
        RecorderFileListViewModel recorderFileListViewModel;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i = fVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.d = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object recordFiles = fVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = fVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(recordFiles);
            IRecordRepo iRecordRepo = this.repo;
            if (iRecordRepo == null) {
                iRecordRepo = null;
            }
            fVar.a = this;
            fVar.d = 1;
            recordFiles = iRecordRepo.getRecordFiles(fVar);
            if (recordFiles == coroutine_suspended) {
                return coroutine_suspended;
            }
            recorderFileListViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recorderFileListViewModel = (RecorderFileListViewModel) fVar.a;
            ResultKt.throwOnFailure(recordFiles);
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith((Collection) recordFiles, new Comparator() { // from class: com.huami.devicerecorder.viewmodel.RecorderFileListViewModel$loadRecordFiles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(!((RecordFile) t).getHasSynced()), Boolean.valueOf(!((RecordFile) t2).getHasSynced()));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it2 = listSortedWith.iterator();
        while (it2.hasNext()) {
            arrayList.add(new PlayItemData((RecordFile) it2.next(), 0, false, false));
        }
        recorderFileListViewModel.recordItems.clear();
        recorderFileListViewModel.recordItems.addAll(arrayList);
        LiveDataExKt.put(recorderFileListViewModel.getRecordFilesLiveData(), recorderFileListViewModel.recordItems);
        return Unit.INSTANCE;
    }

    public final void addLocalRecorderFile(@NotNull RecordFile recordFile) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new RecorderFileListViewModel$addLocalRecorderFile$$inlined$safeLaunch$1(null, this, recordFile), 2, null);
    }

    public final void cacheSelected$device_recorder_release(boolean cache) {
        this.wantSyncFiles.clear();
        if (cache) {
            this.wantSyncFiles.addAll(getSelected());
        }
    }

    public final void changeMode() {
        PageMode pageMode;
        resetSelected$device_recorder_release();
        PageMode value = this.pageModeLiveData.getValue();
        int i = value == null ? -1 : WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i != 1) {
            pageMode = i != 2 ? PageMode.Normal : PageMode.Normal;
        } else {
            pageMode = PageMode.Transport;
        }
        HMLog.info(TAG, new c(value, pageMode));
        this.pageModeLiveData.setValue(pageMode);
    }

    public final void deleteRecorderFile(@NotNull PlayItemData itemData) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new RecorderFileListViewModel$deleteRecorderFile$$inlined$safeLaunch$1(null, itemData, this), 2, null);
    }

    @NotNull
    public final MutableLiveData<PageMode> getPageModeLiveData() {
        return this.pageModeLiveData;
    }

    @NotNull
    public final MutableLiveData<List<PlayItemData>> getRecordFilesLiveData() {
        return this.recordFilesLiveData;
    }

    public final void getRecorderFiles() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new RecorderFileListViewModel$getRecorderFiles$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @NotNull
    public final List<RecordFile> getSelected() {
        List<PlayItemData> list = this.recordItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PlayItemData) obj).getSelected()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((PlayItemData) it2.next()).getRecordFile());
        }
        return arrayList2;
    }

    @NotNull
    public final MutableLiveData<Integer> getSelectedCountLiveData() {
        return this.selectedCountLiveData;
    }

    @NotNull
    public final List<RecordFile> getWantToSyncFile$device_recorder_release() {
        return this.wantSyncFiles;
    }

    public final void onDeviceConnect(boolean connected) {
        PageMode pageMode;
        PageMode value = this.pageModeLiveData.getValue();
        if (connected || value == (pageMode = PageMode.DeviceUnConnect)) {
            pageMode = (connected && value == PageMode.DeviceUnConnect) ? PageMode.Normal : value;
        }
        if (value != pageMode) {
            resetSelected$device_recorder_release();
            LiveDataExKt.put(this.pageModeLiveData, pageMode);
        }
    }

    public final void resetSelected$device_recorder_release() {
        Iterator<T> it2 = this.recordItems.iterator();
        while (it2.hasNext()) {
            ((PlayItemData) it2.next()).setSelected(false);
        }
    }

    public final void selectItem(@NotNull PlayItemData itemData, boolean select) {
        itemData.setSelected(select);
        MutableLiveData<Integer> mutableLiveData = this.selectedCountLiveData;
        List<PlayItemData> list = this.recordItems;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((PlayItemData) it2.next()).getSelected() && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        mutableLiveData.setValue(Integer.valueOf(i));
    }

    public final void setup(@NotNull IRecordRepo repo) {
        this.repo = repo;
    }

    public final void triggerClear() {
        onCleared();
    }
}
