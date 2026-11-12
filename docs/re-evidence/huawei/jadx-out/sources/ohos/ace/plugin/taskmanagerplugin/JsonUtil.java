package ohos.ace.plugin.taskmanagerplugin;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.ble.BleConstants;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ohos.ace.adapter.ALog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class JsonUtil {
    public static Config jsonToConfig(String str) {
        JSONException e;
        Config config;
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            config = new Config();
            try {
                config.setTaskId(jSONObject.optLong("taskId"));
                config.setAction(jSONObject.optInt("action"));
                config.setUrl(jSONObject.optString("url"));
                config.setTitle(jSONObject.optString("title"));
                config.setDescription(jSONObject.optString("description"));
                config.setMode(jSONObject.optInt(Wpt.MODE));
                config.setOverwrite(jSONObject.optBoolean("overwrite"));
                config.setMethod(jSONObject.optString("method"));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
                if (jSONObjectOptJSONObject != null) {
                    HashMap<String, String> map = new HashMap<>();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObjectOptJSONObject.optString(next));
                    }
                    config.setHeaders(map);
                }
                config.setData(jSONObject.optString("data"));
                config.setSaveas(jSONObject.optString("saveas"));
                config.setNetwork(jSONObject.optInt("network"));
                config.setMetered(jSONObject.optBoolean("metered"));
                config.setRoaming(jSONObject.optBoolean("roaming"));
                config.setRedirect(jSONObject.optBoolean("redirect"));
                config.setIndex(jSONObject.optInt("index"));
                config.setBegins(jSONObject.optInt("begins"));
                config.setEnds(jSONObject.optInt("ends"));
                config.setGauge(jSONObject.optBoolean("gauge"));
                config.setPrecise(jSONObject.optBoolean("precise"));
                config.setToken(jSONObject.optString("token"));
                config.setExtras(jSONObject.optString(JsbMapKeyNames.H5_EXTRAS));
                config.setcTime(jSONObject.optLong("cTime"));
                config.setPriority(jSONObject.optInt("priority"));
                config.setRetry(jSONObject.optBoolean("retry"));
                config.setBackground(jSONObject.optBoolean(WatchFaceProvider.BACKGROUND_LABEL));
                config.setForms(jSONObject.optString("forms"));
                config.setFiles(jSONObject.optString("files"));
                config.setBodyFds(jSONObject.optString("bodyFds"));
                config.setBodyFileNames(jSONObject.optString("bodyFileNames"));
                config.setVersion(jSONObject.optInt("version"));
                return config;
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
                return config;
            }
        } catch (JSONException e3) {
            e = e3;
            config = null;
        }
    }

    public static String configToJson(Config config) {
        if (config == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("taskId", config.getTaskId());
            jSONObject.put("action", config.getAction());
            jSONObject.put("url", config.getUrl());
            jSONObject.put("title", config.getTitle());
            jSONObject.put("description", config.getDescription());
            jSONObject.put(Wpt.MODE, config.getMode());
            jSONObject.put("overwrite", config.isOverwrite());
            jSONObject.put("method", config.getMethod());
            if (config.getHeaders() != null) {
                jSONObject.put("headers", new JSONObject(config.getHeaders()));
            }
            jSONObject.put("data", config.getData());
            jSONObject.put("saveas", config.getSaveas());
            jSONObject.put("network", config.getNetwork());
            jSONObject.put("metered", config.isMetered());
            jSONObject.put("roaming", config.isRoaming());
            jSONObject.put("redirect", config.isRedirect());
            jSONObject.put("index", config.getIndex());
            jSONObject.put("begins", config.getBegins());
            jSONObject.put("ends", config.getEnds());
            jSONObject.put("gauge", config.isGauge());
            jSONObject.put("precise", config.isPrecise());
            jSONObject.put("token", config.getToken());
            jSONObject.put("cTime", config.getcTime());
            jSONObject.put("mimeType", config.getMimeType());
            jSONObject.put("version", config.getVersion());
            jSONObject.put("priority", config.getPriority());
            jSONObject.put("retry", config.isRetry());
            jSONObject.put(WatchFaceProvider.BACKGROUND_LABEL, config.isBackground());
            jSONObject.put("forms", config.getForms());
            jSONObject.put("files", config.getFiles());
            jSONObject.put("bodyFds", config.getBodyFds());
            jSONObject.put("bodyFileNames", config.getBodyFileNames());
            jSONObject.put(JsbMapKeyNames.H5_EXTRAS, config.getExtras());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String convertProgressToJson(Progress progress) {
        if (progress == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", progress.getState());
            jSONObject.put("index", progress.getIndex());
            jSONObject.put("processed", progress.getProcessed());
            jSONObject.put("lastProcessed", progress.getLastProcessed());
            if (progress.getSizes() != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Long> it = progress.getSizes().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().longValue());
                }
                jSONObject.put("sizes", jSONArray);
            }
            if (progress.getExtras() != null) {
                jSONObject.put(JsbMapKeyNames.H5_EXTRAS, new JSONObject(progress.getExtras()));
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static Progress convertJsonToProgress(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Progress progress = new Progress();
            progress.setState(jSONObject.optInt("state"));
            progress.setIndex(jSONObject.optInt("index"));
            progress.setProcessed(jSONObject.optLong("processed"));
            progress.setLastProcessed(jSONObject.optLong("lastProcessed"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sizes");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArrayOptJSONArray.optLong(i)));
                }
                progress.setSizes(arrayList);
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(JsbMapKeyNames.H5_EXTRAS);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                HashMap map = new HashMap();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObjectOptJSONObject.optString(next));
                }
                progress.setExtras(map);
            }
            return progress;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static TaskState convertJsonToTaskState(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            TaskState taskState = new TaskState();
            taskState.setPath(jSONObject.optString(BleConstants.KEY_PATH));
            taskState.setResponseCode(jSONObject.optInt("responseCode"));
            taskState.setMessage(jSONObject.optString("message"));
            return taskState;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String convertTaskStateToJson(TaskState taskState) {
        if (taskState == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(BleConstants.KEY_PATH, taskState.getPath());
            jSONObject.put("responseCode", taskState.getResponseCode());
            jSONObject.put("message", taskState.getMessage());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String convertTaskInfoToJson(TaskInfo taskInfo) {
        if (taskInfo == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", String.valueOf(taskInfo.getTid()));
            jSONObject.put("saveas", taskInfo.getSaveas());
            jSONObject.put("url", taskInfo.getUrl());
            jSONObject.put("data", taskInfo.getData());
            jSONObject.put("title", taskInfo.getTitle());
            jSONObject.put("description", taskInfo.getDescription());
            jSONObject.put("action", taskInfo.getAction());
            jSONObject.put(Wpt.MODE, taskInfo.getMode());
            jSONObject.put("mimeType", taskInfo.getMimeType());
            jSONObject.put("ctime", taskInfo.getCtime());
            jSONObject.put("mtime", taskInfo.getMtime());
            jSONObject.put("faults", taskInfo.getFaults());
            jSONObject.put("reason", taskInfo.getReason());
            jSONObject.put("downloadId", taskInfo.getDownloadId());
            jSONObject.put("token", taskInfo.getToken());
            jSONObject.put("version", taskInfo.getVersion());
            List<FileSpec> files = taskInfo.getFiles();
            if (files != null) {
                JSONArray jSONArray = new JSONArray();
                for (FileSpec fileSpec : files) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("name", fileSpec.getName());
                    jSONObject2.put("uri", fileSpec.getUri());
                    jSONObject2.put("filename", fileSpec.getFilename());
                    jSONObject2.put("type", fileSpec.getType());
                    jSONObject2.put("fd", fileSpec.getFd());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("files", jSONArray);
            }
            List<FormItem> forms = taskInfo.getForms();
            if (forms != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (FormItem formItem : forms) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("name", formItem.getName());
                    jSONObject3.put("value", formItem.getValue());
                    jSONArray2.put(jSONObject3);
                }
                jSONObject.put("forms", jSONArray2);
            }
            jSONObject.put("gauge", taskInfo.isGauge());
            jSONObject.put("retry", taskInfo.isRetry());
            jSONObject.put("tries", taskInfo.getTries());
            jSONObject.put("code", taskInfo.getCode());
            jSONObject.put("withSystem", taskInfo.isWithSystem());
            jSONObject.put(JsbMapKeyNames.H5_EXTRAS, taskInfo.getExtras());
            Progress progress = taskInfo.getProgress();
            if (progress != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("state", progress.getState());
                jSONObject4.put("index", progress.getIndex());
                jSONObject4.put("processed", progress.getProcessed());
                jSONObject4.put("lastProcessed", progress.getLastProcessed());
                if (progress.getSizes() != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator<Long> it = progress.getSizes().iterator();
                    while (it.hasNext()) {
                        jSONArray3.put(it.next().longValue());
                    }
                    jSONObject4.put("sizes", jSONArray3);
                }
                jSONObject4.put(JsbMapKeyNames.H5_EXTRAS, progress.getExtras());
                jSONObject.put("progress", jSONObject4);
            }
            TaskState taskStates = taskInfo.getTaskStates();
            if (taskStates != null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(BleConstants.KEY_PATH, taskStates.getPath());
                jSONObject5.put("responseCode", taskStates.getResponseCode());
                jSONObject5.put("message", taskStates.getMessage());
                jSONObject.put("taskStates", jSONObject5);
            }
            Response response = taskInfo.getResponse();
            if (response != null) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("version", response.getVersion());
                jSONObject6.put("statusCode", response.getStatusCode());
                jSONObject6.put("reason", response.getReason());
                if (response.getHeaders() != null) {
                    JSONObject jSONObject7 = new JSONObject();
                    for (Map.Entry<String, List<String>> entry : response.getHeaders().entrySet()) {
                        jSONObject7.put(entry.getKey(), new JSONArray((Collection) entry.getValue()));
                    }
                    jSONObject6.put("headers", jSONObject7);
                }
                jSONObject.put("response", jSONObject6);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static Filter jsonToFilter(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Filter filter = new Filter();
            filter.setBundle(jSONObject.optString("bundle"));
            filter.setBefore(jSONObject.optLong(TtmlNode.ANNOTATION_POSITION_BEFORE, -1L));
            filter.setAfter(jSONObject.optLong(TtmlNode.ANNOTATION_POSITION_AFTER, -1L));
            filter.setState(jSONObject.optInt("state", -1));
            filter.setAction(jSONObject.optInt("action", -1));
            filter.setMode(jSONObject.optInt(Wpt.MODE, -1));
            return filter;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static TaskInfo jsonToTaskInfo(String str) {
        if (str == null) {
            return null;
        }
        try {
            TaskInfo taskInfo = new TaskInfo();
            JSONObject jSONObject = new JSONObject(str);
            taskInfo.setTid(jSONObject.optLong("tid"));
            taskInfo.setSaveas(jSONObject.optString("saveas"));
            taskInfo.setUrl(jSONObject.optString("url"));
            taskInfo.setData(jSONObject.optString("data"));
            taskInfo.setTitle(jSONObject.optString("title"));
            taskInfo.setDescription(jSONObject.optString("description"));
            taskInfo.setAction(jSONObject.optInt("action"));
            taskInfo.setMode(jSONObject.optInt(Wpt.MODE));
            taskInfo.setMimeType(jSONObject.optString("mimeType"));
            taskInfo.setVersion(jSONObject.optInt("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("files");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    FileSpec fileSpec = new FileSpec();
                    fileSpec.setName(jSONObject2.optString("name"));
                    fileSpec.setUri(jSONObject2.optString("uri"));
                    fileSpec.setFilename(jSONObject2.optString("filename"));
                    fileSpec.setType(jSONObject2.optString("type"));
                    fileSpec.setFd(jSONObject2.optInt("fd"));
                    arrayList.add(fileSpec);
                }
                taskInfo.setFiles(arrayList);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("forms");
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i2);
                    FormItem formItem = new FormItem();
                    formItem.setName(jSONObjectOptJSONObject.optString("name"));
                    formItem.setValue(jSONObjectOptJSONObject.optString("value"));
                    arrayList2.add(formItem);
                }
                taskInfo.setForms(arrayList2);
            }
            taskInfo.setGauge(jSONObject.optBoolean("gauge"));
            taskInfo.setRetry(jSONObject.optBoolean("retry"));
            taskInfo.setTries(jSONObject.optInt("tries"));
            taskInfo.setCode(jSONObject.optInt("code"));
            taskInfo.setWithSystem(jSONObject.optBoolean("withSystem"));
            taskInfo.setPriority(jSONObject.optInt("priority"));
            taskInfo.setExtras(jSONObject.optString(JsbMapKeyNames.H5_EXTRAS));
            Progress progress = new Progress();
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("progress");
            if (jSONObjectOptJSONObject2 != null) {
                progress.setState(jSONObjectOptJSONObject2.optInt("state"));
                progress.setIndex(jSONObjectOptJSONObject2.optInt("index"));
                progress.setProcessed(jSONObjectOptJSONObject2.optLong("processed"));
                progress.setLastProcessed(jSONObjectOptJSONObject2.optLong("lastProcessed"));
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("sizes");
                if (jSONArrayOptJSONArray3 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                        arrayList3.add(Long.valueOf(jSONArrayOptJSONArray3.optLong(i3)));
                    }
                    progress.setSizes(arrayList3);
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(JsbMapKeyNames.H5_EXTRAS);
                if (jSONObjectOptJSONObject3 != null) {
                    HashMap map = new HashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObjectOptJSONObject3.optString(next));
                    }
                    progress.setExtras(map);
                }
            }
            taskInfo.setProgress(progress);
            TaskState taskState = new TaskState();
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("taskStates");
            if (jSONObjectOptJSONObject4 != null) {
                taskState.setPath(jSONObjectOptJSONObject4.optString(BleConstants.KEY_PATH));
                taskState.setResponseCode(jSONObjectOptJSONObject4.optInt("responseCode"));
                taskState.setMessage(jSONObjectOptJSONObject4.optString("message"));
                taskInfo.setTaskStates(taskState);
            }
            taskInfo.setCtime(jSONObject.optLong("ctime"));
            taskInfo.setMtime(jSONObject.optLong("mtime"));
            taskInfo.setFaults(jSONObject.optInt("faults"));
            taskInfo.setReason(jSONObject.optString("reason"));
            taskInfo.setDownloadId(jSONObject.optLong("downloadId"));
            taskInfo.setToken(jSONObject.optString("token"));
            return taskInfo;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String mapStringToJson(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    public static HashMap<String, String> jsonToMapString(String str) {
        HashMap<String, String> map = new HashMap<>();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.optString(next));
                }
            } catch (JSONException e) {
                ALog.e(IConstant.TAG, "jsonToMapString: error" + e);
            }
        }
        return map;
    }

    public static String convertFileSpecToJson(List<FileSpec> list) {
        if (list == null) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (FileSpec fileSpec : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", fileSpec.getName());
                jSONObject.put("uri", fileSpec.getUri());
                jSONObject.put("filename", fileSpec.getFilename());
                jSONObject.put("type", fileSpec.getType());
                jSONObject.put("fd", fileSpec.getFd());
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static List<FileSpec> jsonToFileSpecList(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    FileSpec fileSpec = new FileSpec();
                    fileSpec.setName(jSONObject.optString("name"));
                    fileSpec.setUri(jSONObject.optString("uri"));
                    fileSpec.setFilename(jSONObject.optString("filename"));
                    fileSpec.setType(jSONObject.optString("type"));
                    fileSpec.setFd(jSONObject.optInt("fd"));
                    arrayList.add(fileSpec);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static String formsListToJson(List<FormItem> list) {
        if (list == null) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (FormItem formItem : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", formItem.getName());
                jSONObject.put("value", formItem.getValue());
                jSONArray.put(formItem);
            }
            return jSONArray.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static List<FormItem> jsonToFormList(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    FormItem formItem = new FormItem();
                    formItem.setName(jSONObject.optString("name"));
                    formItem.setValue(jSONObject.optString("value"));
                    arrayList.add(formItem);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}
