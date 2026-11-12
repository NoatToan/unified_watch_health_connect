package com.xiaomi.fitness.devicesettings.bluttooth.todo.miui;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.IntRange;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\fJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\u0006\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\u0016\u001a\u00020\fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J \u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eJ \u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0005J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\fH\u0002J\u001e\u0010 \u001a\u00020!2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#J&\u0010$\u001a\u00020!2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#J*\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000eJ\u000e\u0010(\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoProviderDataHelper;", "", "<init>", "()V", "TAG", "", "insertItem", "Landroid/net/Uri;", "context", "Landroid/content/Context;", MiuiCursorConstants.CONTENT, "remindType", "", "remindTimeMillis", "", "queryAllItem", "Landroid/database/Cursor;", "queryMiuiTodo", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoEntity;", "id", "queryMiuiTodoList", "", "limit", "cursorToCoreMiuiEntity", "cursor", "queryItem", "startTime", "endTime", "queryItemUnFinished", "searchTodoItem", "searchString", "queryItemCursor", "changeItemFinishStatus", "", "isFinish", "", "changeStubItemFinishStatus", "index", "insertSubItem", "remindTime", "printCursorAllColumn", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMiuiTodoProviderDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiuiTodoProviderDataHelper.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoProviderDataHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n774#2:421\n865#2,2:422\n1062#2:424\n774#2:425\n865#2,2:426\n1062#2:428\n*S KotlinDebug\n*F\n+ 1 MiuiTodoProviderDataHelper.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoProviderDataHelper\n*L\n115#1:421\n115#1:422,2\n116#1:424\n120#1:425\n120#1:426,2\n121#1:428\n*E\n"})
public final class MiuiTodoProviderDataHelper {

    @NotNull
    public static final MiuiTodoProviderDataHelper INSTANCE = new MiuiTodoProviderDataHelper();

    @NotNull
    private static final String TAG = "MiuiTodoProviderData";

    private MiuiTodoProviderDataHelper() {
    }

    private final MiuiTodoEntity cursorToCoreMiuiEntity(Cursor cursor) {
        String string;
        if (ArraysKt___ArraysKt.contains(new Integer[]{3, 4}, Integer.valueOf(cursor.getInt(cursor.getColumnIndex(MiuiCursorConstants.LOCAL_STATUS)))) || cursor.getInt(cursor.getColumnIndex(MiuiCursorConstants.INPUT_TYPE)) == 1 || (string = cursor.getString(cursor.getColumnIndex(MiuiCursorConstants.CONTENT))) == null || StringsKt__StringsKt.isBlank(string)) {
            return null;
        }
        return new MiuiTodoEntity(cursor.getInt(cursor.getColumnIndex("id")), string, cursor.getInt(cursor.getColumnIndex(MiuiCursorConstants.LIST_TYPE)), cursor.getInt(cursor.getColumnIndex(MiuiCursorConstants.REMIND_TYPE)), cursor.getInt(cursor.getColumnIndex(MiuiCursorConstants.REMIND_REPEAT_TYPE)), cursor.getLong(cursor.getColumnIndex(MiuiCursorConstants.REMIND_TIME)), cursor.getInt(cursor.getColumnIndex(MiuiCursorConstants.IS_FINISH)), cursor.getLong(cursor.getColumnIndex(MiuiCursorConstants.LAST_MODIFIED_TIME)), cursor.getLong(cursor.getColumnIndex(MiuiCursorConstants.CUSTOM_SORT_ID)), cursor.getLong(cursor.getColumnIndex(MiuiCursorConstants.CREATE_TIME)));
    }

    private final Cursor queryAllItem(Context context) {
        try {
            Logger.i(TAG, "queryAllItem");
            return context.getContentResolver().query(Uri.parse(MiuiCursorConstants.URI_TODO_OUTER), null, null, null, null);
        } catch (Exception e) {
            Logger.e(TAG, "queryAllItem exception " + e);
            return null;
        }
    }

    private final Cursor queryItemCursor(Context context, int id) {
        try {
            return context.getContentResolver().query(Uri.parse(MiuiCursorConstants.URI_TODO_OUTER), null, "id = " + id, null, null);
        } catch (Exception e) {
            Logger.e(TAG, "queryItemCursor exception " + e + ";params[" + id + "]");
            return null;
        }
    }

    public static /* synthetic */ List queryMiuiTodoList$default(MiuiTodoProviderDataHelper miuiTodoProviderDataHelper, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return miuiTodoProviderDataHelper.queryMiuiTodoList(context, i);
    }

    public final void changeItemFinishStatus(@NotNull Context context, int id, boolean isFinish) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Logger.i(TAG, "changeItemFinishStatus " + id + ";isFinish " + isFinish);
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(id));
            if (isFinish) {
                contentValues.put(MiuiCursorConstants.IS_FINISH, (Integer) 1);
            } else {
                contentValues.put(MiuiCursorConstants.IS_FINISH, (Integer) 0);
            }
            context.getContentResolver().update(Uri.parse(MiuiCursorConstants.URI_TODO_OUTER_FINISH), contentValues, null, null);
        } catch (Exception e) {
            Logger.e(TAG, "changeItemFinishStatus exception " + e);
        }
    }

    public final void changeStubItemFinishStatus(@NotNull Context context, int id, int index, boolean isFinish) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Logger.i(TAG, "changeStubItemFinishStatus id" + id + ";subIndex " + index + ";isFinish " + isFinish);
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(id));
            if (isFinish) {
                contentValues.put(MiuiCursorConstants.IS_FINISH, (Integer) 1);
            } else {
                contentValues.put(MiuiCursorConstants.IS_FINISH, (Integer) 0);
            }
            contentValues.put(MiuiCursorConstants.SUB_TODO_INDEX, Integer.valueOf(index));
            context.getContentResolver().update(Uri.parse(MiuiCursorConstants.URI_TODO_OUTER_FINISH), contentValues, null, null);
        } catch (Exception e) {
            Logger.e(TAG, "changeStubItemFinishStatus exception " + e);
        }
    }

    @Nullable
    public final Uri insertItem(@NotNull Context context, @NotNull String content, int remindType, long remindTimeMillis) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(MiuiCursorConstants.CONTENT, content);
            contentValues.put(MiuiCursorConstants.REMIND_TYPE, Integer.valueOf(remindType));
            contentValues.put(MiuiCursorConstants.REMIND_TIME, Long.valueOf(remindTimeMillis));
            return context.getContentResolver().insert(Uri.parse(MiuiCursorConstants.URI_TODO_OUTER_INSERT), contentValues);
        } catch (Exception e) {
            Logger.e(TAG, "insertItem exception " + e);
            return null;
        }
    }

    @Nullable
    public final Uri insertSubItem(@NotNull Context context, @Nullable String content, int remindType, long remindTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Logger.i(TAG, "insertSubItem " + content + ";" + remindType + ";" + remindTime);
            ContentValues contentValues = new ContentValues();
            contentValues.put(MiuiCursorConstants.CONTENT, content);
            contentValues.put(MiuiCursorConstants.REMIND_TYPE, Integer.valueOf(remindType));
            contentValues.put(MiuiCursorConstants.REMIND_TIME, Long.valueOf(remindTime));
            contentValues.put(MiuiCursorConstants.LIST_TYPE, (Integer) 1);
            return context.getContentResolver().insert(Uri.parse(MiuiCursorConstants.URI_TODO_OUTER_INSERT), contentValues);
        } catch (Exception e) {
            Logger.e(TAG, "insertSubItem exception " + e);
            return null;
        }
    }

    public final void printCursorAllColumn(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        ArrayList arrayList = new ArrayList();
        try {
            try {
                int count = cursor.getCount();
                while (cursor.moveToNext()) {
                    StringBuilder sb = new StringBuilder();
                    int columnCount = cursor.getColumnCount();
                    for (int i = 0; i < columnCount; i++) {
                        String columnName = cursor.getColumnName(i);
                        String string = cursor.getString(i);
                        sb.append("\"");
                        sb.append(columnName);
                        sb.append("\":");
                        sb.append(string);
                        if (i != cursor.getColumnCount() - 1) {
                            sb.append(",");
                        }
                    }
                    ListExtKt.add(arrayList, sb.toString());
                }
                Logger.i(TAG, "printCursorAllColumn size " + count + ";column count:" + cursor.getColumnCount() + ";detail:" + arrayList);
            } catch (Exception e) {
                Logger.e(TAG, "printCursorAllColumn exception " + e);
            }
        } finally {
            cursor.close();
        }
    }

    @Nullable
    public final Cursor queryItem(@NotNull Context context, long startTime, long endTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return context.getContentResolver().query(Uri.parse(MiuiCursorConstants.URI_TODO_OUTER), null, "remind_time BETWEEN " + startTime + " AND " + endTime, null, null);
        } catch (Exception e) {
            Logger.e(TAG, "queryItem exception " + e + ";params[" + startTime + ";" + endTime + "]");
            return null;
        }
    }

    @Nullable
    public final Cursor queryItemUnFinished(@NotNull Context context, long startTime, long endTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return context.getContentResolver().query(Uri.parse(MiuiCursorConstants.URI_TODO_OUTER), null, "remind_time BETWEEN " + startTime + " AND " + endTime + " AND is_finish == 0", null, null);
        } catch (Exception e) {
            Logger.e(TAG, "queryItemUnFinished exception " + e + ";params[" + startTime + ";" + endTime + "]");
            return null;
        }
    }

    @Nullable
    public final MiuiTodoEntity queryMiuiTodo(@NotNull Context context, int id) {
        MiuiTodoEntity miuiTodoEntityCursorToCoreMiuiEntity;
        Intrinsics.checkNotNullParameter(context, "context");
        Cursor cursorQueryItemCursor = queryItemCursor(context, id);
        if (cursorQueryItemCursor == null) {
            return null;
        }
        MiuiTodoEntity miuiTodoEntity = null;
        while (cursorQueryItemCursor.moveToNext() && (miuiTodoEntityCursorToCoreMiuiEntity = cursorToCoreMiuiEntity(cursorQueryItemCursor)) != null) {
            try {
                try {
                    miuiTodoEntity = miuiTodoEntityCursorToCoreMiuiEntity;
                } catch (Exception e) {
                    Logger.e(TAG, "queryMiuiTodo exception id is: " + id + " " + e);
                    cursorQueryItemCursor.close();
                    return null;
                }
            } catch (Throwable th) {
                cursorQueryItemCursor.close();
                throw th;
            }
        }
        cursorQueryItemCursor.close();
        return miuiTodoEntity;
    }

    @NotNull
    public final List<MiuiTodoEntity> queryMiuiTodoList(@NotNull Context context, @IntRange(from = 0) int limit) throws JSONException {
        List listSubList;
        List<SubTodoEntity> subTodoEntities;
        List<SubTodoEntity> subTodoEntities2;
        Intrinsics.checkNotNullParameter(context, "context");
        Cursor cursorQueryAllItem = queryAllItem(context);
        ArrayList arrayList = new ArrayList();
        if (cursorQueryAllItem == null) {
            Logger.e(TAG, "queryMiuiTodoList cursor is null");
            return arrayList;
        }
        while (cursorQueryAllItem.moveToNext()) {
            try {
                try {
                    MiuiTodoEntity miuiTodoEntityCursorToCoreMiuiEntity = cursorToCoreMiuiEntity(cursorQueryAllItem);
                    if (miuiTodoEntityCursorToCoreMiuiEntity != null) {
                        arrayList.add(miuiTodoEntityCursorToCoreMiuiEntity);
                    }
                } catch (Exception e) {
                    Logger.e(TAG, "queryMiuiTodoList exception " + e);
                }
            } catch (Throwable th) {
                cursorQueryAllItem.close();
                throw th;
            }
        }
        cursorQueryAllItem.close();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((MiuiTodoEntity) obj).getFinishType() == 0) {
                arrayList2.add(obj);
            }
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoProviderDataHelper$queryMiuiTodoList$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MiuiTodoEntity) t2).getCustomSortId()), Long.valueOf(((MiuiTodoEntity) t).getCustomSortId()));
            }
        });
        if (listSortedWith.size() > limit) {
            listSortedWith = listSortedWith.subList(0, limit);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((MiuiTodoEntity) obj2).getFinishType() == 1) {
                arrayList3.add(obj2);
            }
        }
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoProviderDataHelper$queryMiuiTodoList$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MiuiTodoEntity) t2).getLastModifyTimeMillis()), Long.valueOf(((MiuiTodoEntity) t).getLastModifyTimeMillis()));
            }
        });
        if (listSortedWith2.size() > limit) {
            listSortedWith2 = listSortedWith2.subList(0, limit);
        }
        Logger.i(TAG, "checkChildTodoCountBefore notFinishSize " + listSortedWith.size() + ";finishedSize:" + listSortedWith2.size());
        int size = listSortedWith.size();
        int iMax = 0;
        for (int i = 0; i < size; i++) {
            SubTodoList getSubTodoList = ((MiuiTodoEntity) listSortedWith.get(i)).getGetSubTodoList();
            int size2 = (getSubTodoList == null || (subTodoEntities2 = getSubTodoList.getSubTodoEntities()) == null) ? 0 : subTodoEntities2.size();
            iMax += Math.max(1, size2);
            if (iMax > limit) {
                if (size2 <= 1) {
                    listSortedWith = listSortedWith.subList(0, i);
                    break;
                }
                int i2 = limit - (iMax - size2);
                JSONObject jSONObject = new JSONObject(((MiuiTodoEntity) listSortedWith.get(i)).getContent());
                JSONArray jSONArray = jSONObject.getJSONArray("subTodoEntities");
                JSONArray jSONArray2 = new JSONArray();
                for (int i3 = 0; i3 < i2; i3++) {
                    jSONArray2.put(jSONArray.getJSONObject(i3));
                }
                jSONObject.put("subTodoEntities", jSONArray2);
                ((MiuiTodoEntity) listSortedWith.get(i)).setContent(jSONObject.toString());
                listSortedWith = listSortedWith.subList(0, i + 1);
                break;
            }
        }
        int size3 = listSortedWith2.size();
        int iMax2 = 0;
        for (int i4 = 0; i4 < size3; i4++) {
            SubTodoList getSubTodoList2 = ((MiuiTodoEntity) listSortedWith2.get(i4)).getGetSubTodoList();
            int size4 = (getSubTodoList2 == null || (subTodoEntities = getSubTodoList2.getSubTodoEntities()) == null) ? 0 : subTodoEntities.size();
            iMax2 += Math.max(1, size4);
            if (iMax2 > limit) {
                if (size4 > 1) {
                    int i5 = limit - (iMax2 - size4);
                    JSONObject jSONObject2 = new JSONObject(((MiuiTodoEntity) listSortedWith2.get(i4)).getContent());
                    JSONArray jSONArray3 = jSONObject2.getJSONArray("subTodoEntities");
                    JSONArray jSONArray4 = new JSONArray();
                    for (int i6 = 0; i6 < i5; i6++) {
                        jSONArray4.put(jSONArray3.getJSONObject(i6));
                    }
                    jSONObject2.put("subTodoEntities", jSONArray4);
                    ((MiuiTodoEntity) listSortedWith2.get(i4)).setContent(jSONObject2.toString());
                    listSubList = listSortedWith2.subList(0, i4 + 1);
                } else {
                    listSubList = listSortedWith2.subList(0, i4);
                }
                listSortedWith2 = listSubList;
                break;
            }
        }
        Logger.i(TAG, "queryMiuiTodoList notFinishList size " + listSortedWith.size() + " detail: " + listSortedWith + "\n finishedList size " + listSortedWith2.size() + " detail: " + listSortedWith2);
        return CollectionsKt___CollectionsKt.plus((Collection) listSortedWith, (Iterable) listSortedWith2);
    }

    @Nullable
    public final Cursor searchTodoItem(@NotNull Context context, @NotNull String searchString) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        try {
            return context.getContentResolver().query(Uri.parse(MiuiCursorConstants.URI_TODO_OUTER), null, "plain_text like '%" + searchString + "%'", null, MiuiCursorConstants.CREATE_TIME);
        } catch (Exception e) {
            Logger.e(TAG, "searchTodoItem exception " + e + ";params[" + searchString + "]");
            return null;
        }
    }
}
