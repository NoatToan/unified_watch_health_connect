package com.miui.tsmclient.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.util.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static CardInfo a(Context context, String str, JSONObject jSONObject) {
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(str, jSONObject);
        if (jSONObject.has("cardName")) {
            JSONObject jSONObjectC = c(context, DatabaseConstants.CACHE_KEY_PRODUCT_PREFFIX + str);
            if (jSONObjectC != null) {
                LogUtils.d("product:" + jSONObjectC.toString());
                cardInfoMakeCardInfo.mCardSubName = jSONObjectC.optString(DatabaseConstants.PRODUCT_NAME);
            }
        }
        return cardInfoMakeCardInfo;
    }

    public static List<CardInfo> b(Context context, String str) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = context.getContentResolver().query(DatabaseConstants.CONTENT_URI_CACHE, DatabaseConstants.PROJECTION_CACHE, TextUtils.isEmpty(str) ? null : "key IN ('" + str + "')", null, null);
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    try {
                        int columnIndex = cursorQuery.getColumnIndex("key");
                        int columnIndex2 = cursorQuery.getColumnIndex("value");
                        String string = cursorQuery.getString(columnIndex);
                        Object objNextValue = new JSONTokener(cursorQuery.getString(columnIndex2)).nextValue();
                        if (objNextValue instanceof JSONObject) {
                            CardInfo cardInfoA = a(context, string, (JSONObject) objNextValue);
                            if (cardInfoA != null) {
                                arrayList.add(cardInfoA);
                            }
                        } else if (objNextValue instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) objNextValue;
                            for (int i = 0; i < jSONArray.length(); i++) {
                                CardInfo cardInfoA2 = a(context, string, jSONArray.getJSONObject(i));
                                if (cardInfoA2 != null) {
                                    arrayList.add(cardInfoA2);
                                }
                            }
                        }
                    } catch (JSONException e) {
                        LogUtils.e("invalid JSON format", e);
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    public static JSONObject c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Cursor cursorQuery = context.getContentResolver().query(DatabaseConstants.CONTENT_URI_CACHE, DatabaseConstants.PROJECTION_CACHE, "key ='" + str + "'", null, null);
        try {
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        return new JSONObject(cursorQuery.getString(cursorQuery.getColumnIndex("value")));
                    }
                } catch (JSONException e) {
                    LogUtils.e("invalid jsonobject readed from db", e);
                }
            }
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        int iDelete = context.getContentResolver().delete(DatabaseConstants.CONTENT_URI_CACHE, null, null);
        LogUtils.i("delete all cards, cache count: " + iDelete);
        return iDelete;
    }

    public static void b(Context context, CardInfo cardInfo) {
        if (context == null || cardInfo == null || cardInfo.mCardType == null) {
            return;
        }
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("key", cardInfo.mCardType);
        contentValues.put("value", cardInfo.serialize().toString());
        context.getContentResolver().insert(DatabaseConstants.CONTENT_URI_CACHE, contentValues);
        context.getContentResolver().notifyChange(DatabaseConstants.PUBLIC_CONTENT_URI, null);
    }

    public static void a(Context context, CardInfo cardInfo) {
        List<CardInfo> listB;
        if (context == null || cardInfo == null || (listB = b(context, cardInfo.getCardType())) == null) {
            return;
        }
        Iterator<CardInfo> it = listB.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().mAid, cardInfo.mAid)) {
                it.remove();
                a(context, listB, cardInfo.getCardType());
                return;
            }
        }
    }

    public static int a(Context context, String str) {
        if (context == null || str == null) {
            return 0;
        }
        int iDelete = context.getContentResolver().delete(DatabaseConstants.CONTENT_URI_CACHE, "key = ?", new String[]{str});
        LogUtils.i("delete " + str + ", cache count: " + iDelete);
        return iDelete;
    }

    public static void a(Context context, List<? extends CardInfo> list, String str) {
        if (context == null) {
            return;
        }
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("key", str);
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends CardInfo> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().serialize());
        }
        contentValues.put("value", jSONArray.toString());
        context.getContentResolver().insert(DatabaseConstants.CONTENT_URI_CACHE, contentValues);
        context.getContentResolver().notifyChange(DatabaseConstants.PUBLIC_CONTENT_URI, null);
    }
}
