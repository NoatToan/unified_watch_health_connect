package com.huawei.phoneservice.feedbackcommon.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.feedbackcommon.entity.ProblemEntity;
import defpackage.yzc;
import defpackage.zcm;
import defpackage.zcp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes13.dex */
public final class FeedbackProblemData extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static FeedbackProblemData f21802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SQLiteDatabase f21803b;
    public static final e e = new e(null);

    public final void c(ProblemEntity problemEntity) {
        zcp.c(problemEntity, "");
        g.a("FeedbackDataManager", "saveFailProblem", new Object[0]);
        String strA = problemEntity.a();
        zcp.b((Object) strA, "");
        if (b(strA)) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("problemId", problemEntity.a());
        SQLiteDatabase sQLiteDatabase = f21803b;
        zcp.e(sQLiteDatabase);
        sQLiteDatabase.insert("table_feedback_problem", null, contentValues);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if ((i == 1 || i == 2) && sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("create table if not exists table_feedback_problem(_id INTEGER primary key autoincrement,problemId String);");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        zcp.c(sQLiteDatabase, "");
        sQLiteDatabase.execSQL("create table if not exists table_feedback_problem(_id INTEGER primary key autoincrement,problemId String);");
    }

    public final List<ProblemEntity> b() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = f21803b;
        Cursor cursorQuery = sQLiteDatabase != null ? sQLiteDatabase.query("table_feedback_problem", null, null, null, null, null, null) : null;
        while (true) {
            Boolean boolValueOf = cursorQuery != null ? Boolean.valueOf(cursorQuery.moveToNext()) : null;
            zcp.e(boolValueOf);
            if (!boolValueOf.booleanValue()) {
                cursorQuery.close();
                return arrayList;
            }
            ProblemEntity problemEntity = new ProblemEntity();
            problemEntity.a(cursorQuery.getString(cursorQuery.getColumnIndex("problemId")));
            arrayList.add(problemEntity);
        }
    }

    public final void d(String str) {
        g.a("FeedbackDataManager", "deleteFailProblem", new Object[0]);
        SQLiteDatabase sQLiteDatabase = f21803b;
        zcp.e(sQLiteDatabase);
        sQLiteDatabase.delete("table_feedback_problem", "problemId=?", new String[]{str});
    }

    private final boolean b(String str) {
        SQLiteDatabase sQLiteDatabase = f21803b;
        zcp.e(sQLiteDatabase);
        Cursor cursorQuery = sQLiteDatabase.query("table_feedback_problem", null, "problemId= ?", new String[]{str}, null, null, null);
        boolean z = false;
        while (cursorQuery.moveToFirst()) {
            z = true;
        }
        cursorQuery.close();
        return z;
    }

    @JvmStatic
    public static final FeedbackProblemData a(Context context) {
        return e.d(context);
    }

    public static final class e {
        @JvmStatic
        public final FeedbackProblemData d(Context context) {
            if (FeedbackProblemData.f21802a == null) {
                synchronized (FeedbackProblemData.class) {
                    if (FeedbackProblemData.f21802a == null) {
                        e eVar = FeedbackProblemData.e;
                        FeedbackProblemData.f21802a = new FeedbackProblemData(context != null ? context.getApplicationContext() : null);
                    }
                    yzc yzcVar = yzc.e;
                }
            }
            return FeedbackProblemData.f21802a;
        }

        public /* synthetic */ e(zcm zcmVar) {
            this();
        }

        private e() {
        }
    }

    public FeedbackProblemData(Context context) {
        super(context, "db_feedback_data", (SQLiteDatabase.CursorFactory) null, 3);
        synchronized (FeedbackMediaData.class) {
            if (f21803b == null) {
                f21803b = getWritableDatabase();
            }
            yzc yzcVar = yzc.e;
        }
    }
}
