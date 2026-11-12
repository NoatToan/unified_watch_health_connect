package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageExt;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class phd {
    public static MessageObject a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        MessageObject messageObject = new MessageObject();
        messageObject.setMsgId(c(cursor, "msgId"));
        messageObject.setMsgType(d(cursor, "msgType"));
        messageObject.setModule(c(cursor, "module"));
        messageObject.setType(c(cursor, "type"));
        messageObject.setMetadata(c(cursor, "metadata"));
        messageObject.setFlag(d(cursor, "flag"));
        messageObject.setWeight(d(cursor, "weight"));
        messageObject.setReadFlag(d(cursor, CommonUtil.READ_FLAG));
        messageObject.setMsgTitle(c(cursor, CommonUtil.MSG_TITLE));
        messageObject.setMsgContent(c(cursor, CommonUtil.MSG_CONTENT));
        messageObject.setCreateTime(e(cursor, "createTime"));
        messageObject.setExpireTime(e(cursor, "expireTime"));
        messageObject.setReceiveTime(e(cursor, CommonUtil.RECEIVE_TIME));
        messageObject.setImgUri(c(cursor, CommonUtil.IMG_URI));
        messageObject.setImgBigUri(c(cursor, CommonUtil.IMG_BIG_URI));
        messageObject.setDetailUri(c(cursor, CommonUtil.DETAIL_URI));
        messageObject.setDetailUriExt(c(cursor, CommonUtil.DETAIL_URI_EXTERNAL));
        messageObject.setMsgFrom(c(cursor, CommonUtil.MSG_FROM));
        messageObject.setPosition(d(cursor, "position"));
        messageObject.setMsgPosition(d(cursor, CommonUtil.MSG_POSITION));
        messageObject.setHuid(c(cursor, "huid"));
        messageObject.setImei(c(cursor, CommonUtil.IMEI));
        messageObject.setNotified(d(cursor, CommonUtil.MSG_NOTIFY));
        messageObject.setInfoClassify(c(cursor, CommonUtil.INFO_CLASSIFY));
        messageObject.setHeatMapCity(c(cursor, CommonUtil.HEAT_MAP_CITY));
        messageObject.setInfoRecommend(d(cursor, CommonUtil.INFO_RECOMMEND));
        messageObject.setMsgUserLabel(c(cursor, CommonUtil.MSG_USER_LABEL));
        return messageObject;
    }

    public static boolean e(MessageObject messageObject) {
        if (messageObject == null) {
            return true;
        }
        long jC = phq.c(System.currentTimeMillis());
        long expireTime = messageObject.getExpireTime();
        if (expireTime == 0 || expireTime == 1) {
            return false;
        }
        boolean z = expireTime < jC;
        if (z) {
            ReleaseLogUtil.d("UIDV_MessageUtils", "isExpired: true, expireTime:", Long.valueOf(expireTime));
        }
        return z;
    }

    public static boolean d(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        int iX = ltb.x(ltb.h(ltb.e(messageObject.getCreateTime())));
        int iE = ltb.e();
        LogUtil.a("UIDV_MessageUtils", "createYear: ", Integer.valueOf(iX), " nowYear: ", Integer.valueOf(iE));
        return iX == iE;
    }

    public static MessageObject d(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        MessageObject messageObject = new MessageObject();
        messageObject.setMsgId(c(cursor, "msgId"));
        messageObject.setMsgType(d(cursor, "msgType"));
        messageObject.setModule(c(cursor, "module"));
        messageObject.setType(c(cursor, "type"));
        messageObject.setMetadata(c(cursor, "metadata"));
        messageObject.setFlag(d(cursor, "flag"));
        messageObject.setWeight(d(cursor, "weight"));
        messageObject.setReadFlag(d(cursor, CommonUtil.READ_FLAG));
        messageObject.setMsgTitle(c(cursor, CommonUtil.MSG_TITLE));
        messageObject.setMsgContent(c(cursor, CommonUtil.MSG_CONTENT));
        messageObject.setCreateTime(e(cursor, "createTime"));
        messageObject.setExpireTime(e(cursor, "expireTime"));
        messageObject.setReceiveTime(e(cursor, CommonUtil.RECEIVE_TIME));
        messageObject.setImgUri(c(cursor, CommonUtil.IMG_URI));
        messageObject.setImgBigUri(c(cursor, CommonUtil.IMG_BIG_URI));
        messageObject.setDetailUri(c(cursor, CommonUtil.DETAIL_URI));
        messageObject.setDetailUriExt(c(cursor, CommonUtil.DETAIL_URI_EXTERNAL));
        messageObject.setMsgFrom(c(cursor, CommonUtil.MSG_FROM));
        messageObject.setPosition(d(cursor, "position"));
        messageObject.setMsgPosition(d(cursor, CommonUtil.MSG_POSITION));
        messageObject.setHuid(c(cursor, "huid"));
        messageObject.setImei(c(cursor, CommonUtil.IMEI));
        messageObject.setNotified(d(cursor, CommonUtil.MSG_NOTIFY));
        messageObject.setInfoClassify(c(cursor, CommonUtil.INFO_CLASSIFY));
        messageObject.setHeatMapCity(c(cursor, CommonUtil.HEAT_MAP_CITY));
        messageObject.setInfoRecommend(d(cursor, CommonUtil.INFO_RECOMMEND));
        messageObject.setMsgUserLabel(c(cursor, CommonUtil.MSG_USER_LABEL));
        messageObject.setLayout(d(cursor, "layout"));
        messageObject.setMessageExtList(a(c(cursor, CommonUtil.MESSAGE_EXTERNAL_LIST)));
        messageObject.setPageType(d(cursor, CommonUtil.PAGE_TYPE));
        messageObject.setImageTextSeparateSwitch(d(cursor, CommonUtil.IMAGE_TEXT_SEPARATE_SWITCH));
        messageObject.setHarmonyImgUrl(c(cursor, CommonUtil.HARMONY_IMAGE_URL));
        messageObject.setHarmonyImageSize(c(cursor, CommonUtil.HARMONY_IMAGE_SIZE));
        messageObject.setLatestGetMsgTimestamp(c(cursor, CommonUtil.RESERVE_PARAM_ONE));
        return messageObject;
    }

    private static List<MessageExt> a(String str) {
        Gson gson = new Gson();
        ArrayList arrayList = new ArrayList(16);
        try {
            if (!TextUtils.isEmpty(str)) {
                return (List) gson.fromJson(str, new TypeToken<List<MessageExt>>() { // from class: com.huawei.pluginmessagecenter.provider.MessageUtils$1
                }.getType());
            }
        } catch (JsonSyntaxException unused) {
            LogUtil.e("UIDV_MessageUtils", "getMessageExtList JsonSyntaxException fromJson fail");
        }
        return arrayList;
    }

    private static String c(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        LogUtil.e("UIDV_MessageUtils", "getStringColumn wrong columnName = ", str);
        return "";
    }

    private static int d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getInt(columnIndex);
        }
        LogUtil.e("UIDV_MessageUtils", "getIntColumn wrong columnName = ", str);
        return 0;
    }

    private static long e(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getLong(columnIndex);
        }
        LogUtil.e("UIDV_MessageUtils", "getLongColumn wrong columnName = ", str);
        return 0L;
    }

    public static boolean b(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        if (TextUtils.isEmpty(messageObject.getMsgId())) {
            LogUtil.a("UIDV_MessageUtils", "Message ID can't be null");
            return false;
        }
        if (TextUtils.isEmpty(messageObject.getMsgTitle())) {
            LogUtil.a("UIDV_MessageUtils", "Message title can't be null");
            return false;
        }
        if (messageObject.getCreateTime() < 0) {
            LogUtil.a("UIDV_MessageUtils", "Message create time less than 0");
            return false;
        }
        if (messageObject.getPosition() != 0) {
            return true;
        }
        LogUtil.a("UIDV_MessageUtils", "Message position is invalid");
        return false;
    }

    public static boolean c(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return messageObject.getMsgPosition() == 12 || messageObject.getMsgPosition() == 24 || messageObject.getMsgPosition() == 25 || messageObject.getMsgPosition() == 27 || messageObject.getMsgPosition() == 28 || messageObject.getMsgPosition() == 41;
    }

    public static ContentValues b(String str, String str2, String str3) {
        MessageObject messageObject = new MessageObject();
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", str);
        contentValues.put("module", str2);
        contentValues.put("type", str3);
        contentValues.put("msgId", messageObject.getMsgId());
        contentValues.put("msgType", Integer.valueOf(messageObject.getMsgType()));
        contentValues.put("flag", Integer.valueOf(messageObject.getFlag()));
        contentValues.put("weight", Integer.valueOf(messageObject.getWeight()));
        contentValues.put(CommonUtil.READ_FLAG, Integer.valueOf(messageObject.getReadFlag()));
        contentValues.put(CommonUtil.MSG_TITLE, messageObject.getMsgTitle());
        contentValues.put("createTime", Long.valueOf(messageObject.getCreateTime()));
        contentValues.put(CommonUtil.RECEIVE_TIME, Long.valueOf(System.currentTimeMillis()));
        contentValues.put("expireTime", Long.valueOf(messageObject.getExpireTime()));
        contentValues.put(CommonUtil.DETAIL_URI, messageObject.getDetailUri());
        contentValues.put("position", Integer.valueOf(messageObject.getPosition()));
        contentValues.put(CommonUtil.MSG_POSITION, Integer.valueOf(messageObject.getMsgPosition()));
        contentValues.put(CommonUtil.MSG_NOTIFY, (Integer) 0);
        return contentValues;
    }

    public static ContentValues a(MessageObject messageObject) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("metadata", messageObject.getMetadata());
        contentValues.put("msgType", Integer.valueOf(messageObject.getMsgType()));
        contentValues.put("flag", Integer.valueOf(messageObject.getFlag()));
        contentValues.put("weight", Integer.valueOf(messageObject.getWeight()));
        contentValues.put(CommonUtil.READ_FLAG, Integer.valueOf(messageObject.getReadFlag()));
        contentValues.put(CommonUtil.MSG_TITLE, messageObject.getMsgTitle());
        contentValues.put(CommonUtil.MSG_CONTENT, messageObject.getMsgContent());
        contentValues.put("createTime", Long.valueOf(messageObject.getCreateTime()));
        contentValues.put(CommonUtil.RECEIVE_TIME, Long.valueOf(System.currentTimeMillis()));
        contentValues.put("expireTime", Long.valueOf(messageObject.getExpireTime()));
        contentValues.put(CommonUtil.IMG_URI, messageObject.getImgUri());
        contentValues.put(CommonUtil.IMG_BIG_URI, messageObject.getImgBigUri());
        contentValues.put(CommonUtil.DETAIL_URI, messageObject.getDetailUri());
        contentValues.put(CommonUtil.DETAIL_URI_EXTERNAL, messageObject.getDetailUriExt());
        contentValues.put(CommonUtil.MSG_FROM, messageObject.getMsgFrom());
        contentValues.put("position", Integer.valueOf(messageObject.getPosition()));
        contentValues.put(CommonUtil.MSG_POSITION, Integer.valueOf(messageObject.getMsgPosition()));
        contentValues.put("huid", messageObject.getHuid());
        contentValues.put(CommonUtil.IMEI, messageObject.getImei());
        contentValues.put(CommonUtil.MSG_NOTIFY, Integer.valueOf(messageObject.getNotified()));
        contentValues.put(CommonUtil.INFO_CLASSIFY, messageObject.getInfoClassify());
        contentValues.put(CommonUtil.HEAT_MAP_CITY, messageObject.getHeatMapCity());
        contentValues.put(CommonUtil.INFO_RECOMMEND, Integer.valueOf(messageObject.getInfoRecommend()));
        contentValues.put(CommonUtil.MSG_USER_LABEL, messageObject.getMsgUserLabel());
        contentValues.put("layout", Integer.valueOf(messageObject.getLayout()));
        contentValues.put(CommonUtil.PAGE_TYPE, Integer.valueOf(messageObject.getPageType()));
        contentValues.put(CommonUtil.IMAGE_TEXT_SEPARATE_SWITCH, Integer.valueOf(messageObject.getImageTextSeparateSwitch()));
        contentValues.put(CommonUtil.HARMONY_IMAGE_SIZE, messageObject.getHarmonyImageSize());
        contentValues.put(CommonUtil.HARMONY_IMAGE_URL, messageObject.getHarmonyImgUrl());
        if (!TextUtils.isEmpty(messageObject.getLatestGetMsgTimestamp())) {
            contentValues.put(CommonUtil.RESERVE_PARAM_ONE, messageObject.getLatestGetMsgTimestamp());
        }
        List<MessageExt> messageExtList = messageObject.getMessageExtList();
        if (messageExtList != null) {
            contentValues.put(CommonUtil.MESSAGE_EXTERNAL_LIST, new Gson().toJson(messageExtList));
        }
        return contentValues;
    }

    public static String c(Object obj) {
        if (obj == null || Constants.NULL.equals(obj.toString())) {
            return "";
        }
        return obj.toString().trim();
    }
}
