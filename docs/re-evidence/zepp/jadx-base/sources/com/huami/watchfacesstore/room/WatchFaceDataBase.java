package com.huami.watchfacesstore.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.huami.watchfacesstore.room.publisher.PublisherDao;
import com.huami.watchfacesstore.room.publisher.PublisherInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Database(entities = {WatchFaceInfo.class, PublisherInfo.class}, exportSchema = false, version = 4)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/watchfacesstore/room/WatchFaceDataBase;", "Landroidx/room/RoomDatabase;", "Lcom/huami/watchfacesstore/room/WatchFaceDao;", "watchFaceDao", "Lcom/huami/watchfacesstore/room/publisher/PublisherDao;", "publisherDao", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class WatchFaceDataBase extends RoomDatabase {
    @NotNull
    public abstract PublisherDao publisherDao();

    @NotNull
    public abstract WatchFaceDao watchFaceDao();
}
