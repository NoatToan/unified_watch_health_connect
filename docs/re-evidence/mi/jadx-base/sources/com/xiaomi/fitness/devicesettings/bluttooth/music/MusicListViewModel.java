package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicListBean;
import defpackage.qyi;
import defpackage.wzi;
import defpackage.xc6;
import defpackage.zwh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\u0004\u0012\u00020\n0\u000eJ8\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\n0\u000eJ\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "originList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicListBean;", "getOriginList", "()Ljava/util/List;", "filterByKey", "", "key", "", "success", "Lkotlin/Function1;", "", "loadMusicList", "context", "Landroid/content/Context;", "pageType", "", "suportType", "groupBy", "list", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMusicListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicListViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n774#2:162\n865#2,2:163\n1863#2,2:165\n1863#2,2:167\n*S KotlinDebug\n*F\n+ 1 MusicListViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListViewModel\n*L\n33#1:162\n33#1:163,2\n127#1:165,2\n144#1:167,2\n*E\n"})
public final class MusicListViewModel extends AbsViewModel {

    @NotNull
    private final List<MusicListBean> originList = new ArrayList();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicListViewModel$loadMusicList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicListViewModel$loadMusicList$1", f = "MusicListViewModel.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMusicListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicListViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListViewModel$loadMusicList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n1863#2,2:162\n1010#2,2:164\n*S KotlinDebug\n*F\n+ 1 MusicListViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListViewModel$loadMusicList$1\n*L\n91#1:162,2\n114#1:164,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $pageType;
        final /* synthetic */ Function1<List<MusicListBean>, Unit> $success;
        final /* synthetic */ int $suportType;
        int label;
        final /* synthetic */ MusicListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(int i, MusicListViewModel musicListViewModel, Function1<? super List<MusicListBean>, Unit> function1, int i2, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pageType = i;
            this.this$0 = musicListViewModel;
            this.$success = function1;
            this.$suportType = i2;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$pageType, this.this$0, this.$success, this.$suportType, this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String artist;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                MusicListViewModel$loadMusicList$1$list$1 musicListViewModel$loadMusicList$1$list$1 = new MusicListViewModel$loadMusicList$1$list$1(this.$suportType, this.$context, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, musicListViewModel$loadMusicList$1$list$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<MusicBean> list = (List) obj;
            ArrayList arrayList = new ArrayList();
            int i2 = this.$pageType;
            if (i2 == 0) {
                for (MusicBean musicBean : list) {
                    if (musicBean.getArtist() == null || musicBean.getAlbum() == null) {
                        artist = musicBean.getArtist();
                        if (artist == null) {
                            artist = ResourceExtKt.getString(wzi.D5);
                        }
                    } else {
                        artist = ResourceExtKt.getString(wzi.B5, musicBean.getArtist(), musicBean.getAlbum());
                    }
                    MusicListBean musicListBean = new MusicListBean(i2, musicBean.getName(), artist);
                    musicListBean.getMusicList().add(musicBean);
                    arrayList.add(musicListBean);
                }
            } else {
                Boxing.boxBoolean(arrayList.addAll(this.this$0.groupBy(i2, list)));
            }
            this.this$0.getOriginList().addAll(arrayList);
            if (arrayList.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicListViewModel$loadMusicList$1$invokeSuspend$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        String strB = zwh.b(zwh.d(((MusicListBean) t).getName()));
                        xc6.d("MusicPushViewModel pinyin:" + strB);
                        String strB2 = zwh.b(zwh.d(((MusicListBean) t2).getName()));
                        xc6.d("MusicPushViewModel pinyin:" + strB2);
                        return ComparisonsKt__ComparisonsKt.compareValues(strB, strB2);
                    }
                });
            }
            this.$success.invoke2(arrayList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void filterByKey(@NotNull String key, @NotNull Function1<? super List<MusicListBean>, Unit> success) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(success, "success");
        List<MusicListBean> list = this.originList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            MusicListBean musicListBean = (MusicListBean) obj;
            if (StringsKt__StringsKt.contains$default((CharSequence) musicListBean.getName(), (CharSequence) key, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) musicListBean.getDesc(), (CharSequence) key, false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        success.invoke2(arrayList);
    }

    @NotNull
    public final List<MusicListBean> getOriginList() {
        return this.originList;
    }

    @NotNull
    public final List<MusicListBean> groupBy(int pageType, @NotNull List<MusicBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        SortedMap sortedMapSortedMapOf = MapsKt__MapsJVMKt.sortedMapOf(new Pair[0]);
        ArrayList arrayList2 = new ArrayList();
        for (MusicBean musicBean : list) {
            String album = pageType == 2 ? musicBean.getAlbum() : musicBean.getArtist();
            if (album == null) {
                arrayList2.add(musicBean);
            } else {
                List arrayList3 = (List) sortedMapSortedMapOf.get(album);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    sortedMapSortedMapOf.put(album, arrayList3);
                }
                arrayList3.add(musicBean);
            }
        }
        Set<Map.Entry> setEntrySet = sortedMapSortedMapOf.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qyi.o, ((List) entry.getValue()).size(), Integer.valueOf(((List) entry.getValue()).size()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            MusicListBean musicListBean = new MusicListBean(pageType, (String) key, quantityString);
            musicListBean.getMusicList().addAll((Collection) entry.getValue());
            arrayList.add(musicListBean);
        }
        if (!arrayList2.isEmpty()) {
            String string = ResourceExtKt.getString(wzi.D5);
            String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(qyi.o, arrayList2.size(), Integer.valueOf(arrayList2.size()));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            MusicListBean musicListBean2 = new MusicListBean(pageType, string, quantityString2);
            musicListBean2.getMusicList().addAll(arrayList2);
            arrayList.add(musicListBean2);
        }
        return arrayList;
    }

    public final void loadMusicList(@NotNull Context context, int pageType, int suportType, @NotNull Function1<? super List<MusicListBean>, Unit> success) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(success, "success");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(pageType, this, success, suportType, context, null), 3, null);
    }
}
