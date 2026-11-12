package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001Bí\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0010%\u001a\u00020\r\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+Bk\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b*\u0010,B\u0083\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010-\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b*\u0010.B\u0097\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010-\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b*\u0010/B§\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010-\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b*\u00100B±\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010-\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b*\u00101B¿\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010-\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b*\u00102BÍ\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010-\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b*\u00103BÏ\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b*\u00104B×\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0010%\u001a\u00020\r¢\u0006\u0004\b*\u00105¨\u00066"}, d2 = {"Landroidx/room/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Lvd/d$c;", "sqliteOpenHelperFactory", "Landroidx/room/b0$e;", "migrationContainer", "", "Landroidx/room/b0$b;", "callbacks", "", "allowMainThreadQueries", "Landroidx/room/b0$d;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "", "", "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Landroidx/room/b0$f;", "prepackagedDatabaseCallback", "typeConverters", "autoMigrationSpecs", "allowDestructiveMigrationForAllTables", "Lud/b;", "sqliteDriver", "Lt13/g;", "queryCoroutineContext", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/b0$f;Ljava/util/List;Ljava/util/List;ZLud/b;Lt13/g;)V", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;ZLjava/util/Set;)V", "multiInstanceInvalidation", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;)V", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;)V", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;)V", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/b0$f;)V", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/b0$f;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/b0$f;Ljava/util/List;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/b0$f;Ljava/util/List;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Landroidx/room/b0$e;Ljava/util/List;ZLandroidx/room/b0$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/b0$f;Ljava/util/List;Ljava/util/List;Z)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vd.d.c f10772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0.e f10773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b0.b> f10774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0.d f10776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f10777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f10778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Intent f10779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set<Integer> f10782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f10783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f10784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable<InputStream> f10785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0.f f10786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<Object> f10787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<Object> f10788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f10789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ud.b f10790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t13.g f10791v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f10792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10793x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10794y;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    public c(Context context, String str, vd.d.c cVar, b0.e eVar, List<? extends b0.b> list, boolean z14, b0.d dVar, Executor executor, Executor executor2, Intent intent, boolean z15, boolean z16, Set<Integer> set, String str2, File file, Callable<InputStream> callable, b0.f fVar, List<? extends Object> list2, List<Object> list3, boolean z17, ud.b bVar, t13.g gVar) {
        context.getClass();
        eVar.getClass();
        dVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        this.f10770a = context;
        this.f10771b = str;
        this.f10772c = cVar;
        this.f10773d = eVar;
        this.f10774e = list;
        this.f10775f = z14;
        this.f10776g = dVar;
        this.f10777h = executor;
        this.f10778i = executor2;
        this.f10779j = intent;
        this.f10780k = z15;
        this.f10781l = z16;
        this.f10782m = set;
        this.f10783n = str2;
        this.f10784o = file;
        this.f10785p = callable;
        this.f10786q = fVar;
        this.f10787r = list2;
        this.f10788s = list3;
        this.f10789t = z17;
        this.f10790u = bVar;
        this.f10791v = gVar;
        this.f10792w = intent != null;
        this.f10793x = true;
        this.f10794y = 25;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @o13.e
    public c(Context context, String str, vd.d.c cVar, b0.e eVar, List<? extends b0.b> list, boolean z14, b0.d dVar, Executor executor, boolean z15, Set<Integer> set) {
        context.getClass();
        cVar.getClass();
        eVar.getClass();
        dVar.getClass();
        executor.getClass();
        p13.j0 j0Var = p13.j0.f134944a;
        this(context, str, cVar, eVar, list, z14, dVar, executor, executor, null, z15, false, set, null, null, null, null, j0Var, j0Var, false, null, null);
    }

    @o13.e
    public c(Context context, String str, vd.d.c cVar, b0.e eVar, List<? extends b0.b> list, boolean z14, b0.d dVar, Executor executor, Executor executor2, boolean z15, boolean z16, boolean z17, Set<Integer> set) {
        Context context2;
        Intent intent;
        context.getClass();
        cVar.getClass();
        eVar.getClass();
        dVar.getClass();
        executor.getClass();
        executor2.getClass();
        if (z15) {
            context2 = context;
            intent = new Intent(context2, (Class<?>) MultiInstanceInvalidationService.class);
        } else {
            context2 = context;
            intent = null;
        }
        Intent intent2 = intent;
        p13.j0 j0Var = p13.j0.f134944a;
        this(context2, str, cVar, eVar, list, z14, dVar, executor, executor2, intent2, z16, z17, set, null, null, null, null, j0Var, j0Var, false, null, null);
    }

    @o13.e
    public c(Context context, String str, vd.d.c cVar, b0.e eVar, List<? extends b0.b> list, boolean z14, b0.d dVar, Executor executor, Executor executor2, boolean z15, boolean z16, boolean z17, Set<Integer> set, String str2, File file) {
        Context context2;
        Intent intent;
        context.getClass();
        cVar.getClass();
        eVar.getClass();
        dVar.getClass();
        executor.getClass();
        executor2.getClass();
        if (z15) {
            context2 = context;
            intent = new Intent(context2, (Class<?>) MultiInstanceInvalidationService.class);
        } else {
            context2 = context;
            intent = null;
        }
        Intent intent2 = intent;
        p13.j0 j0Var = p13.j0.f134944a;
        this(context2, str, cVar, eVar, list, z14, dVar, executor, executor2, intent2, z16, z17, set, str2, file, null, null, j0Var, j0Var, false, null, null);
    }

    @o13.e
    public c(Context context, String str, vd.d.c cVar, b0.e eVar, List<? extends b0.b> list, boolean z14, b0.d dVar, Executor executor, Executor executor2, boolean z15, boolean z16, boolean z17, Set<Integer> set, String str2, File file, Callable<InputStream> callable) {
        Context context2;
        Intent intent;
        context.getClass();
        cVar.getClass();
        eVar.getClass();
        dVar.getClass();
        executor.getClass();
        executor2.getClass();
        if (z15) {
            context2 = context;
            intent = new Intent(context2, (Class<?>) MultiInstanceInvalidationService.class);
        } else {
            context2 = context;
            intent = null;
        }
        Intent intent2 = intent;
        p13.j0 j0Var = p13.j0.f134944a;
        this(context2, str, cVar, eVar, list, z14, dVar, executor, executor2, intent2, z16, z17, set, str2, file, callable, null, j0Var, j0Var, false, null, null);
    }

    @o13.e
    @SuppressLint({"LambdaLast"})
    public c(Context context, String str, vd.d.c cVar, b0.e eVar, List<? extends b0.b> list, boolean z14, b0.d dVar, Executor executor, Executor executor2, boolean z15, boolean z16, boolean z17, Set<Integer> set, String str2, File file, Callable<InputStream> callable, b0.f fVar) {
        Context context2;
        Intent intent;
        context.getClass();
        cVar.getClass();
        eVar.getClass();
        dVar.getClass();
        executor.getClass();
        executor2.getClass();
        if (z15) {
            context2 = context;
            intent = new Intent(context2, (Class<?>) MultiInstanceInvalidationService.class);
        } else {
            context2 = context;
            intent = null;
        }
        Intent intent2 = intent;
        p13.j0 j0Var = p13.j0.f134944a;
        this(context2, str, cVar, eVar, list, z14, dVar, executor, executor2, intent2, z16, z17, set, str2, file, callable, fVar, j0Var, j0Var, false, null, null);
    }

    @o13.e
    @SuppressLint({"LambdaLast"})
    public c(Context context, String str, vd.d.c cVar, b0.e eVar, List<? extends b0.b> list, boolean z14, b0.d dVar, Executor executor, Executor executor2, boolean z15, boolean z16, boolean z17, Set<Integer> set, String str2, File file, Callable<InputStream> callable, b0.f fVar, List<? extends Object> list2) {
        Context context2;
        Intent intent;
        context.getClass();
        cVar.getClass();
        eVar.getClass();
        dVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        if (z15) {
            context2 = context;
            intent = new Intent(context2, (Class<?>) MultiInstanceInvalidationService.class);
        } else {
            context2 = context;
            intent = null;
        }
        this(context2, str, cVar, eVar, list, z14, dVar, executor, executor2, intent, z16, z17, set, str2, file, callable, fVar, list2, p13.j0.f134944a, false, null, null);
    }

    @o13.e
    @SuppressLint({"LambdaLast"})
    public c(Context context, String str, vd.d.c cVar, b0.e eVar, List<? extends b0.b> list, boolean z14, b0.d dVar, Executor executor, Executor executor2, boolean z15, boolean z16, boolean z17, Set<Integer> set, String str2, File file, Callable<InputStream> callable, b0.f fVar, List<? extends Object> list2, List<Object> list3) {
        Context context2;
        Intent intent;
        context.getClass();
        cVar.getClass();
        eVar.getClass();
        dVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        if (z15) {
            context2 = context;
            intent = new Intent(context2, (Class<?>) MultiInstanceInvalidationService.class);
        } else {
            context2 = context;
            intent = null;
        }
        this(context2, str, cVar, eVar, list, z14, dVar, executor, executor2, intent, z16, z17, set, str2, file, callable, null, list2, list3, false, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    @SuppressLint({"LambdaLast"})
    public c(Context context, String str, vd.d.c cVar, b0.e eVar, List<? extends b0.b> list, boolean z14, b0.d dVar, Executor executor, Executor executor2, Intent intent, boolean z15, boolean z16, Set<Integer> set, String str2, File file, Callable<InputStream> callable, b0.f fVar, List<? extends Object> list2, List<Object> list3) {
        this(context, str, cVar, eVar, list, z14, dVar, executor, executor2, intent, z15, z16, set, str2, file, callable, null, list2, list3, false, null, null);
        context.getClass();
        cVar.getClass();
        eVar.getClass();
        dVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public c(Context context, String str, vd.d.c cVar, b0.e eVar, List<? extends b0.b> list, boolean z14, b0.d dVar, Executor executor, Executor executor2, Intent intent, boolean z15, boolean z16, Set<Integer> set, String str2, File file, Callable<InputStream> callable, b0.f fVar, List<? extends Object> list2, List<Object> list3, boolean z17) {
        this(context, str, cVar, eVar, list, z14, dVar, executor, executor2, intent, z15, z16, set, str2, file, callable, null, list2, list3, z17, null, null);
        context.getClass();
        cVar.getClass();
        eVar.getClass();
        dVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
    }
}
