package miui.assistant.index;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import miui.assistant.assist.AssistContent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class AssistContentItem extends BaseItem {
    private String agent;
    private String cardName;
    private String contentDescription;
    private String expirationTime;
    private String extrasJson;
    private String icon;
    private String lastMessageTime;
    private String moreUri;
    private String orderNumber;
    private String status;
    private String title;
    private String type;
    private String unit;
    private String uri;

    public static AssistContent convertToAssistContent(AssistContentItem assistContentItem) {
        AssistContent assistContent = new AssistContent();
        assistContent.setStructuredData(fillJson(assistContentItem).toString());
        return assistContent;
    }

    private static JSONObject fillJson(AssistContentItem assistContentItem) {
        JSONObject jSONObject = new JSONObject();
        for (Field field : AssistContentItem.class.getDeclaredFields()) {
            String name = field.getName();
            String str = null;
            try {
                str = (String) AssistContentItem.class.getMethod("get" + name.substring(0, 1).toUpperCase() + name.substring(1), new Class[0]).invoke(assistContentItem, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("AssistContentItem", "IllegalAccessException " + e);
            } catch (NoSuchMethodException e2) {
                Log.e("AssistContentItem", "NoSuchMethodException " + e2);
            } catch (InvocationTargetException e3) {
                Log.e("AssistContentItem", "InvocationTargetException " + e3);
            }
            if (str != null) {
                try {
                    jSONObject.put(name, str);
                } catch (JSONException e4) {
                    Log.e("AssistContentItem", "JSONException " + e4);
                }
            }
        }
        return jSONObject;
    }

    public String getAgent() {
        return this.agent;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getContentDescription() {
        return this.contentDescription;
    }

    public String getExpirationTime() {
        return this.expirationTime;
    }

    public String getExtrasJson() {
        return this.extrasJson;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getItemType() {
        return this.type;
    }

    public String getLastMessageTime() {
        return this.lastMessageTime;
    }

    public String getMoreUri() {
        return this.moreUri;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getUri() {
        return this.uri;
    }

    public void setAgent(String str) {
        this.agent = str;
    }

    public void setCardName(String str) {
        this.cardName = str;
    }

    public void setContentDescription(String str) {
        this.contentDescription = str;
    }

    public void setExpirationTime(String str) {
        this.expirationTime = str;
    }

    public void setExtrasJson(String str) {
        this.extrasJson = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setLastMessageTime(String str) {
        this.lastMessageTime = str;
    }

    public void setMoreUri(String str) {
        this.moreUri = str;
    }

    public void setOrderNumber(String str) {
        this.orderNumber = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnit(String str) {
        this.unit = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }
}
