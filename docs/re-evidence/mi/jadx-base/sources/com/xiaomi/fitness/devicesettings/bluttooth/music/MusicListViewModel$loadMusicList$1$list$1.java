package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import com.xiaomi.fitness.devicesettings.utils.MusicUtils;
import defpackage.xc6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicListViewModel$loadMusicList$1$list$1", f = "MusicListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMusicListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicListViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListViewModel$loadMusicList$1$list$1\n+ 2 Cursor.kt\nandroidx/core/database/CursorKt\n*L\n1#1,161:1\n112#2:162\n112#2:163\n112#2:164\n112#2:165\n73#2:166\n86#2:167\n*S KotlinDebug\n*F\n+ 1 MusicListViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListViewModel$loadMusicList$1$list$1\n*L\n68#1:162\n69#1:163\n70#1:164\n71#1:165\n72#1:166\n73#1:167\n*E\n"})
public final class MusicListViewModel$loadMusicList$1$list$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<MusicBean>>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $suportType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicListViewModel$loadMusicList$1$list$1(int i, Context context, Continuation<? super MusicListViewModel$loadMusicList$1$list$1> continuation) {
        super(2, continuation);
        this.$suportType = i;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicListViewModel$loadMusicList$1$list$1(this.$suportType, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Uri EXTERNAL_CONTENT_URI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        String str = "mime_type IN " + MusicUtils.parseType$default(MusicUtils.INSTANCE, this.$suportType, false, 2, null);
        xc6.d("MusicPushViewModel " + str);
        Cursor cursorQuery = this.$context.getContentResolver().query(EXTERNAL_CONTENT_URI, new String[]{"title", "_display_name", "album", "artist", "mime_type", "duration", "_id"}, str, null, "title ASC");
        ArrayList arrayList = new ArrayList();
        if (cursorQuery == null) {
            return arrayList;
        }
        xc6.d("MusicPushViewModel count:" + cursorQuery.getCount());
        while (cursorQuery.moveToNext()) {
            int columnIndex = cursorQuery.getColumnIndex("title");
            String string = cursorQuery.isNull(columnIndex) ? null : cursorQuery.getString(columnIndex);
            int columnIndex2 = cursorQuery.getColumnIndex("album");
            String string2 = cursorQuery.isNull(columnIndex2) ? null : cursorQuery.getString(columnIndex2);
            int columnIndex3 = cursorQuery.getColumnIndex("artist");
            String string3 = cursorQuery.isNull(columnIndex3) ? null : cursorQuery.getString(columnIndex3);
            int columnIndex4 = cursorQuery.getColumnIndex("mime_type");
            String string4 = cursorQuery.isNull(columnIndex4) ? null : cursorQuery.getString(columnIndex4);
            int columnIndex5 = cursorQuery.getColumnIndex("duration");
            Integer numBoxInt = cursorQuery.isNull(columnIndex5) ? null : Boxing.boxInt(cursorQuery.getInt(columnIndex5));
            int columnIndex6 = cursorQuery.getColumnIndex("_id");
            Long lBoxLong = cursorQuery.isNull(columnIndex6) ? null : Boxing.boxLong(cursorQuery.getLong(columnIndex6));
            xc6.d(string + " " + string2 + " " + string3 + " " + string4 + " " + lBoxLong + " " + numBoxInt);
            if (lBoxLong != null) {
                MusicUtils musicUtils = MusicUtils.INSTANCE;
                String str2 = MusicUtils.parse2Display$default(musicUtils, string, false, 2, null);
                Intrinsics.checkNotNull(str2);
                String str3 = musicUtils.parse2Display(string3, true);
                String str4 = musicUtils.parse2Display(string2, true);
                Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, lBoxLong.longValue());
                Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
                arrayList.add(new MusicBean(str2, str3, str4, uriWithAppendedId, numBoxInt != null ? numBoxInt.intValue() : 0));
            }
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<MusicBean>> continuation) {
        return ((MusicListViewModel$loadMusicList$1$list$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
