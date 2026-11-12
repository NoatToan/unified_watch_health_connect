package ohos.ace.adapter.capability.clipboard;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ohos.ace.adapter.ALog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class ClipboardAosp extends ClipboardPluginBase {
    private static final String LOG_TAG = "ClipboardPlugin";
    private static final String MULTI_TYPE_DATA_MIME = "arkuix/multipletypedata";
    private static final String MULTI_TYPE_DATA_RECORDS = "pasteDataRecords";
    private static final String MULTI_TYPE_DATA_RECORDS_CUSTOM_SPAN_DATA = "customSpanData";
    private static final String MULTI_TYPE_DATA_RECORDS_CUSTOM_URI_DATA = "customUriData";
    private static final String MULTI_TYPE_DATA_RECORDS_DATA = "data";
    private static final String MULTI_TYPE_DATA_RECORDS_IS_MULTI = "isMulti";
    private static final String MULTI_TYPE_DATA_RECORDS_TEXT = "text";
    private static final String MULTI_TYPE_DATA_RECORDS_TYPE = "type";
    private static final String MULTI_TYPE_DATA_RECORDS_TYPE_IMAGE = "1";
    private static final String MULTI_TYPE_DATA_RECORDS_TYPE_SPAN_STRING = "3";
    private static final String MULTI_TYPE_DATA_RECORDS_TYPE_TEXT = "0";
    private static final String MULTI_TYPE_DATA_RECORDS_TYPE_URI = "2";
    private ClipboardManager clipManager;
    private Context context;

    public ClipboardAosp(Context context) {
        this.context = context;
        nativeInit();
    }

    private void initClipManager() {
        Context context = this.context;
        if (context != null) {
            Object systemService = context.getSystemService("clipboard");
            if (systemService instanceof ClipboardManager) {
                this.clipManager = (ClipboardManager) systemService;
                return;
            } else {
                ALog.e(LOG_TAG, "unable to get clipboard service");
                this.clipManager = null;
                return;
            }
        }
        ALog.e(LOG_TAG, "context is null");
        this.clipManager = null;
    }

    private String processRecordObject(JSONObject jSONObject, Set<String> set, Intent intent) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        String string = null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if ("text".equals(next)) {
                string = jSONObject.getString("text");
            } else if ("type".equals(next)) {
                String string2 = jSONObject.getString("type");
                if ("0".equals(string2)) {
                    set.add("text/plain");
                } else if ("2".equals(string2)) {
                    set.add("text/uri-list");
                } else if ("3".equals(string2)) {
                    set.add("text/vnd.android.intent");
                } else {
                    ALog.w(LOG_TAG, "Unsupported data type.");
                }
            } else if ("data".equals(next)) {
                if ("3".equals(jSONObject.getString("type"))) {
                    intent.putExtra(MULTI_TYPE_DATA_RECORDS_CUSTOM_SPAN_DATA, jSONObject.getString("data"));
                } else {
                    intent.putExtra(MULTI_TYPE_DATA_RECORDS_CUSTOM_URI_DATA, jSONObject.getString("data"));
                }
            } else {
                ALog.w(LOG_TAG, "Unsupported data type.");
            }
        }
        return string;
    }

    private void setPasteDataFromJson(Set<String> set, ArrayList<ClipData.Item> arrayList, JSONArray jSONArray) throws JSONException {
        ClipData.Item item;
        if (jSONArray == null || jSONArray.length() == 0) {
            ALog.w(LOG_TAG, "Invalid JSONArray: null or empty");
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Intent intent = new Intent();
            String strProcessRecordObject = processRecordObject(jSONObject, set, intent);
            if ((intent.hasExtra(MULTI_TYPE_DATA_RECORDS_CUSTOM_SPAN_DATA) || intent.hasExtra(MULTI_TYPE_DATA_RECORDS_CUSTOM_URI_DATA)) && strProcessRecordObject != null) {
                item = new ClipData.Item(strProcessRecordObject, intent, null);
            } else {
                item = new ClipData.Item(intent);
            }
            arrayList.add(item);
        }
    }

    @Override // ohos.ace.adapter.capability.clipboard.ClipboardPluginBase
    public String getData() {
        if (this.clipManager == null) {
            initClipManager();
        }
        ClipboardManager clipboardManager = this.clipManager;
        if (clipboardManager != null) {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            CharSequence text = (primaryClip == null || primaryClip.getItemCount() <= 0) ? null : primaryClip.getItemAt(0).getText();
            if (text != null) {
                return text.toString();
            }
            return "";
        }
        return "";
    }

    @Override // ohos.ace.adapter.capability.clipboard.ClipboardPluginBase
    public void setData(String str) {
        if (this.clipManager == null) {
            initClipManager();
        }
        if (this.clipManager != null) {
            this.clipManager.setPrimaryClip(ClipData.newPlainText(null, str));
        }
    }

    @Override // ohos.ace.adapter.capability.clipboard.ClipboardPluginBase
    public boolean hasData() {
        if (this.clipManager == null) {
            initClipManager();
        }
        ClipboardManager clipboardManager = this.clipManager;
        if (clipboardManager != null) {
            return clipboardManager.hasPrimaryClip();
        }
        return false;
    }

    @Override // ohos.ace.adapter.capability.clipboard.ClipboardPluginBase
    public void clear() {
        if (this.clipManager == null) {
            initClipManager();
        }
        ClipboardManager clipboardManager = this.clipManager;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, null));
        }
    }

    @Override // ohos.ace.adapter.capability.clipboard.ClipboardPluginBase
    public boolean isMultiTypeData() {
        ClipData primaryClip;
        ClipDescription description;
        if (this.clipManager == null) {
            initClipManager();
        }
        ClipboardManager clipboardManager = this.clipManager;
        return (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || (description = primaryClip.getDescription()) == null || !description.hasMimeType(MULTI_TYPE_DATA_MIME)) ? false : true;
    }

    @Override // ohos.ace.adapter.capability.clipboard.ClipboardPluginBase
    public void setMultiTypeData(String str) {
        if (this.clipManager == null) {
            initClipManager();
        }
        if (this.clipManager != null) {
            try {
                JSONArray jSONArray = new JSONArray(new JSONObject(str).getString(MULTI_TYPE_DATA_RECORDS));
                HashSet hashSet = new HashSet();
                ArrayList<ClipData.Item> arrayList = new ArrayList<>();
                setPasteDataFromJson(hashSet, arrayList, jSONArray);
                if (arrayList.isEmpty()) {
                    ALog.w(LOG_TAG, "Unsupported data type.");
                    return;
                }
                hashSet.add(MULTI_TYPE_DATA_MIME);
                ClipData clipData = new ClipData("Multiple Items", (String[]) hashSet.toArray(new String[0]), arrayList.get(0));
                for (int i = 1; i < arrayList.size(); i++) {
                    clipData.addItem(arrayList.get(i));
                }
                ClipboardManager clipboardManager = this.clipManager;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(clipData);
                }
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "Failed to parse ArkUI-X clipboard data.");
            }
        }
    }

    @Override // ohos.ace.adapter.capability.clipboard.ClipboardPluginBase
    public String getMultiTypeData() {
        if (this.clipManager == null) {
            initClipManager();
        }
        ClipboardManager clipboardManager = this.clipManager;
        if (clipboardManager != null) {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() <= 0) {
                return "{}";
            }
            try {
                return convertClipDataToJson(primaryClip, isMultiTypeData());
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "Failed to convert ClipData to a JSON string.");
            }
        }
        return "{}";
    }

    private String convertClipDataToJson(ClipData clipData, boolean z) throws JSONException {
        int i;
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
            ClipData.Item itemAt = clipData.getItemAt(i2);
            JSONObject jSONObject = new JSONObject();
            if (itemAt.getText() != null) {
                jSONObject.put("text", itemAt.getText().toString());
                jSONObject.put("type", "0");
                i = 1;
            } else {
                i = 0;
            }
            if (z) {
                Intent intent = itemAt.getIntent();
                if (intent != null && intent.hasExtra(MULTI_TYPE_DATA_RECORDS_CUSTOM_SPAN_DATA)) {
                    jSONObject.put("data", intent.getStringExtra(MULTI_TYPE_DATA_RECORDS_CUSTOM_SPAN_DATA));
                    jSONObject.put("type", "3");
                    i++;
                }
                if (intent != null && intent.hasExtra(MULTI_TYPE_DATA_RECORDS_CUSTOM_URI_DATA)) {
                    jSONObject.put("data", intent.getStringExtra(MULTI_TYPE_DATA_RECORDS_CUSTOM_URI_DATA));
                    jSONObject.put("type", "2");
                    i++;
                }
            }
            if (itemAt.getUri() != null) {
                jSONObject.put("data", itemAt.getUri().toString());
                jSONObject.put("type", "2");
                i++;
            }
            if (i > 1) {
                jSONObject.put(MULTI_TYPE_DATA_RECORDS_IS_MULTI, true);
            } else {
                jSONObject.put(MULTI_TYPE_DATA_RECORDS_IS_MULTI, false);
            }
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(MULTI_TYPE_DATA_RECORDS, jSONArray);
        return jSONObject2.toString();
    }
}
