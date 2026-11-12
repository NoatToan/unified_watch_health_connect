package com.huami.watch.musicupload.viewmodel;

import android.app.Application;
import android.database.Cursor;
import android.provider.MediaStore;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.watch.musicupload.adapter.FileInfo;
import com.huami.watch.musicupload.adapter.FileItemInfo;
import com.huami.watch.musicupload.adapter.FileType;
import com.huami.watch.musicupload.fragment.MusicConstantKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0014J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007J\u0006\u0010\u0018\u001a\u00020\u0005J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\"\u0010 R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010$R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\"\u0010.\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020(0\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b/\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/FileViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "a", "child", "", "g", "", "info", "f", "Ljava/io/File;", "file", "c", "b", "updateAllFiles", "fileItemInfo", "openFolder", "item", "selectFile", "unselectFile", "", "backToRoot", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "getSelected", "resetSelected", "", "fileType", "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getShowFilesLiveData", "()Landroidx/lifecycle/MutableLiveData;", "showFilesLiveData", "getFolderChangeLiveData", "folderChangeLiveData", "Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "currentFolder", GoogleApiAvailabilityLight.a, "fileItemRoot", "", LogUtil.I, "getSelectFileCount", "()I", "setSelectFileCount", "(I)V", "selectFileCount", "getSelectFileCountLiveData", "selectFileCountLiveData", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "l", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class FileViewModel extends AndroidViewModel {
    private static final String g = "FileViewModel";
    private static final String h = "external";
    private static final String i = ".mp3";
    private static final String j = ".wav";
    private static final String k = "FileViewModelRootDirName";

    @NotNull
    private static final a l = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<FileItemInfo>> showFilesLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> folderChangeLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private FileItemInfo currentFolder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FileItemInfo fileItemRoot;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int selectFileCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> selectFileCountLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"com/huami/watch/musicupload/viewmodel/FileViewModel$a", "", "", Logger.ROOT_LOGGER_NAME, "Ljava/lang/String;", "SUFFIX_MP3", "SUFFIX_WAV", "TAG", "VOLUME_EXTERNAL", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ FileInfo a;
        public final /* synthetic */ FileItemInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FileInfo fileInfo, FileItemInfo fileItemInfo) {
            super(0);
            this.a = fileInfo;
            this.b = fileItemInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("open folder: ");
            sb.append(this.a.getPath());
            sb.append(", and file size: ");
            List<FileItemInfo> children = this.b.getChildren();
            sb.append(children != null ? Integer.valueOf(children.size()) : null);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start list files, fileType: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "query empty files!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Cursor a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Cursor cursor) {
            super(0);
            this.a = cursor;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "query files count: " + this.a.getCount();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "query files finish, count: " + this.a.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "kotlin.jvm.PlatformType", "item1", "item2", "", "a", "(Lcom/huami/watch/musicupload/adapter/FileItemInfo;Lcom/huami/watch/musicupload/adapter/FileItemInfo;)I"}, k = 3, mv = {1, 4, 1})
    public static final class g<T> implements Comparator<FileItemInfo> {
        public static final g a = new g();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(FileItemInfo fileItemInfo, FileItemInfo fileItemInfo2) {
            String lowerCase;
            FileInfo fileInfo;
            String name;
            String lowerCase2;
            FileInfo fileInfo2;
            String name2;
            String str = "";
            if (fileItemInfo == null || (fileInfo2 = fileItemInfo.getFileInfo()) == null || (name2 = fileInfo2.getName()) == null || (lowerCase = name2.toLowerCase(Locale.getDefault())) == null) {
                lowerCase = "";
            }
            if (fileItemInfo2 != null && (fileInfo = fileItemInfo2.getFileInfo()) != null && (name = fileInfo.getName()) != null && (lowerCase2 = name.toLowerCase(Locale.getDefault())) != null) {
                str = lowerCase2;
            }
            return lowerCase.compareTo(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.FileViewModel$updateAllFiles$1", f = "FileViewModel.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "catelog failed as folder is null";
            }
        }

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FileViewModel.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FileViewModel fileViewModel = FileViewModel.this;
                a unused = FileViewModel.l;
                this.a = 1;
                obj = fileViewModel.e(".mp3", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : (List) obj) {
                File parentFile = ((File) obj2).getParentFile();
                Object arrayList = linkedHashMap.get(parentFile);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(parentFile, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file = (File) entry.getKey();
                List list = (List) entry.getValue();
                if (file == null) {
                    a unused2 = FileViewModel.l;
                    HMLog.info(FileViewModel.g, a.a);
                } else {
                    FileItemInfo fileItemInfoC = FileViewModel.this.c(file);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        FileItemInfo fileItemInfoB = FileViewModel.this.b((File) it2.next());
                        fileItemInfoB.setParentItem(fileItemInfoC);
                        arrayList3.add(fileItemInfoB);
                    }
                    fileItemInfoC.setChildren(FileViewModel.this.f(arrayList3));
                    fileItemInfoC.setParentItem(FileViewModel.this.fileItemRoot);
                    arrayList2.add(fileItemInfoC);
                }
            }
            FileViewModel.this.fileItemRoot.setChildren(FileViewModel.this.f(arrayList2));
            FileViewModel.this.setSelectFileCount(0);
            FileViewModel fileViewModel2 = FileViewModel.this;
            fileViewModel2.openFolder(fileViewModel2.fileItemRoot);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ FileItemInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(FileItemInfo fileItemInfo) {
            super(0);
            this.a = fileItemInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updateParentSelectStatus failed. child: " + this.a;
        }
    }

    public FileViewModel(@NotNull Application application) {
        super(application);
        this.showFilesLiveData = new MutableLiveData<>();
        this.folderChangeLiveData = new MutableLiveData<>();
        this.selectFileCountLiveData = new MutableLiveData<>();
        FileItemInfo fileItemInfoA = a();
        this.fileItemRoot = fileItemInfoA;
        this.currentFolder = fileItemInfoA;
        updateAllFiles();
    }

    private final FileItemInfo a() {
        return new FileItemInfo(2, new FileInfo(k, k, 0L, FileType.Root), false, null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FileItemInfo b(File file) {
        return new FileItemInfo(1, new FileInfo(file.getAbsolutePath(), file.getName(), file.length(), FileType.File), false, null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FileItemInfo c(File file) {
        return new FileItemInfo(2, new FileInfo(file.getAbsolutePath(), file.getName(), 0L, FileType.Folder), false, null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FileItemInfo> f(List<FileItemInfo> info) {
        return CollectionsKt___CollectionsKt.sortedWith(info, g.a);
    }

    private final void g(FileItemInfo child) {
        FileItemInfo parentItem = child.getParentItem();
        if (parentItem == null) {
            HMLog.info(g, new i(child));
            return;
        }
        List<FileItemInfo> children = parentItem.getChildren();
        boolean z = false;
        if (children == null) {
            z = true;
            break;
        } else if (!children.isEmpty()) {
            Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                if (!((FileItemInfo) it2.next()).getSelect()) {
                    z = true;
                    break;
                }
            }
        }
        parentItem.setSelect(!z);
    }

    public final boolean backToRoot() {
        if (Intrinsics.areEqual(this.currentFolder, this.fileItemRoot)) {
            return false;
        }
        openFolder(this.fileItemRoot);
        return true;
    }

    public final /* synthetic */ Object e(String str, Continuation<? super List<? extends File>> continuation) {
        ArrayList arrayList = new ArrayList();
        HMLog.info(g, new c(str));
        Cursor cursorQuery = getApplication().getContentResolver().query(MediaStore.Files.getContentUri(h), new String[]{"_data", "title"}, "_data LIKE '%" + str + "'", null, "date_modified");
        if (cursorQuery == null) {
            HMLog.info(g, d.a);
            return arrayList;
        }
        HMLog.info(g, new e(cursorQuery));
        if (cursorQuery.moveToLast()) {
            do {
                File file = new File(cursorQuery.getString(0));
                if (file.exists()) {
                    arrayList.add(file);
                }
            } while (cursorQuery.moveToPrevious());
        }
        cursorQuery.close();
        HMLog.info(g, new f(arrayList));
        return arrayList;
    }

    @NotNull
    public final MutableLiveData<Boolean> getFolderChangeLiveData() {
        return this.folderChangeLiveData;
    }

    public final int getSelectFileCount() {
        return this.selectFileCount;
    }

    @NotNull
    public final MutableLiveData<Integer> getSelectFileCountLiveData() {
        return this.selectFileCountLiveData;
    }

    @NotNull
    public final List<FileInfo> getSelected() {
        ArrayList arrayList = new ArrayList();
        List<FileItemInfo> children = this.fileItemRoot.getChildren();
        if (children != null) {
            Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                List<FileItemInfo> children2 = ((FileItemInfo) it2.next()).getChildren();
                if (children2 != null) {
                    for (FileItemInfo fileItemInfo : children2) {
                        if (fileItemInfo.getSelect()) {
                            arrayList.add(fileItemInfo.getFileInfo());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final MutableLiveData<List<FileItemInfo>> getShowFilesLiveData() {
        return this.showFilesLiveData;
    }

    public final void openFolder(@NotNull FileItemInfo fileItemInfo) {
        HMLog.info(g, new b(fileItemInfo.getFileInfo(), fileItemInfo));
        this.currentFolder = fileItemInfo;
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.areEqual(fileItemInfo, this.fileItemRoot)) {
            fileItemInfo.setType(0);
            arrayList.add(fileItemInfo);
        } else {
            List<FileItemInfo> children = fileItemInfo.getChildren();
            if (children != null) {
                Iterator<T> it2 = children.iterator();
                while (it2.hasNext()) {
                    ((FileItemInfo) it2.next()).setType(2);
                }
            }
        }
        List<FileItemInfo> children2 = fileItemInfo.getChildren();
        if (children2 != null) {
            arrayList.addAll(children2);
        }
        MusicConstantKt.put(this.showFilesLiveData, arrayList);
        MusicConstantKt.put(this.folderChangeLiveData, Boolean.valueOf(Intrinsics.areEqual(fileItemInfo, this.fileItemRoot)));
    }

    public final void resetSelected() {
        List<FileItemInfo> children = this.fileItemRoot.getChildren();
        if (children != null) {
            for (FileItemInfo fileItemInfo : children) {
                fileItemInfo.setSelect(false);
                List<FileItemInfo> children2 = fileItemInfo.getChildren();
                if (children2 != null) {
                    Iterator<T> it2 = children2.iterator();
                    while (it2.hasNext()) {
                        ((FileItemInfo) it2.next()).setSelect(false);
                    }
                }
            }
            List<FileItemInfo> value = this.showFilesLiveData.getValue();
            if (value != null) {
                MusicConstantKt.put(this.showFilesLiveData, value);
            }
            this.selectFileCount = 0;
            MusicConstantKt.put(this.selectFileCountLiveData, 0);
        }
    }

    public final void selectFile(@NotNull FileItemInfo item) {
        if (item.getType() == 2 || item.getType() == 0) {
            item.setSelect(true);
            List<FileItemInfo> children = item.getChildren();
            if (children != null) {
                for (FileItemInfo fileItemInfo : children) {
                    if (!fileItemInfo.getSelect()) {
                        fileItemInfo.setSelect(true);
                        this.selectFileCount++;
                    }
                }
            }
        } else {
            item.setSelect(true);
            this.selectFileCount++;
            g(item);
        }
        MusicConstantKt.put(this.selectFileCountLiveData, Integer.valueOf(this.selectFileCount));
    }

    public final void setSelectFileCount(int i2) {
        this.selectFileCount = i2;
    }

    public final void unselectFile(@NotNull FileItemInfo item) {
        if (item.getType() == 2 || item.getType() == 0) {
            item.setSelect(false);
            List<FileItemInfo> children = item.getChildren();
            if (children != null) {
                for (FileItemInfo fileItemInfo : children) {
                    if (fileItemInfo.getSelect()) {
                        fileItemInfo.setSelect(false);
                        this.selectFileCount--;
                    }
                }
            }
        } else {
            item.setSelect(false);
            this.selectFileCount--;
            g(item);
        }
        MusicConstantKt.put(this.selectFileCountLiveData, Integer.valueOf(this.selectFileCount));
    }

    public final void updateAllFiles() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h(null), 2, null);
    }
}
