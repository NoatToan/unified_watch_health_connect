package ohos.ace.plugin.clipboard;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.FileUriExposedException;
import android.os.Handler;
import android.text.Html;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes46.dex */
public class ClipboardAosp {
    private static final String ARKUI_X_DATA_FLAG = "arkuix/pastedataflag";
    private static final String LOG_TAG = "ClipboardPlugin";
    private static final String MIME_OH_TEXT_HTML = "text/html";
    private static final String MIME_OH_TEXT_PLAIN = "text/plain";
    private static final String MIME_OH_TEXT_URI = "text/uri";
    private static final String MIME_OH_TEXT_WANT = "text/want";
    private static final String MIME_PLATFORM_TEXT_HTML = "text/html";
    private static final String MIME_PLATFORM_TEXT_INTENT = "text/intent";
    private static final String MIME_PLATFORM_TEXT_PLAIN = "text/plain";
    private static final String MIME_PLATFORM_TEXT_URI_LIST = "text/uri-list";
    private static final Map<String, String> MIME_TYPE_MAPPING;
    private static final String MULTI_TYPE_DATA_MIME = "arkuix/multipletypedata";
    private static final int VERSION_CODE_P = 28;
    private ClipboardManager clipManager;
    private Context context;
    private Handler mainHandler;
    private long timeStamp = 0;
    private final AtomicInteger subscribeCount = new AtomicInteger(0);
    private ClipboardManager.OnPrimaryClipChangedListener listener = null;
    private Runnable pasteboardChangeRunnable = new Runnable() { // from class: ohos.ace.plugin.clipboard.ClipboardAosp$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m2053lambda$new$0$ohosacepluginclipboardClipboardAosp();
        }
    };

    protected final native void nativeInit();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: onPasteboardChanged, reason: merged with bridge method [inline-methods] */
    public native void m2053lambda$new$0$ohosacepluginclipboardClipboardAosp();

    static {
        HashMap map = new HashMap();
        MIME_TYPE_MAPPING = map;
        map.put("text/plain", "text/plain");
        map.put("text/html", "text/html");
        map.put(MIME_OH_TEXT_URI, MIME_PLATFORM_TEXT_URI_LIST);
        map.put(MIME_OH_TEXT_WANT, MIME_PLATFORM_TEXT_INTENT);
    }

    public ClipboardAosp(Context context) {
        this.context = context;
        this.mainHandler = new Handler(context.getMainLooper());
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
                Log.e(LOG_TAG, "unable to get clipboard service");
                this.clipManager = null;
                return;
            }
        }
        Log.e(LOG_TAG, "context is null");
        this.clipManager = null;
    }

    private boolean ensureClipManagerAvailable() {
        if (this.clipManager == null) {
            initClipManager();
        }
        if (this.clipManager != null) {
            return true;
        }
        Log.e(LOG_TAG, "clipboard manager is not available");
        return false;
    }

    private String convertToPlatformMimeType(String str) {
        if (str == null) {
            return null;
        }
        return MIME_TYPE_MAPPING.getOrDefault(str, str);
    }

    private String convertToOHMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (Map.Entry<String, String> entry : MIME_TYPE_MAPPING.entrySet()) {
            if (entry.getValue().equals(str)) {
                return entry.getKey();
            }
        }
        return str;
    }

    private ClipData buildClipData(ClipDescription clipDescription, DataRecordDTO[] dataRecordDTOArr) {
        ArrayList arrayList = new ArrayList();
        if (dataRecordDTOArr != null && dataRecordDTOArr.length > 0) {
            for (DataRecordDTO dataRecordDTO : dataRecordDTOArr) {
                if (dataRecordDTO != null) {
                    ClipData.Item itemRecordToClipItem = recordToClipItem(dataRecordDTO);
                    if (itemRecordToClipItem == null) {
                        return null;
                    }
                    arrayList.add(itemRecordToClipItem);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        try {
            ClipData clipData = new ClipData(clipDescription, (ClipData.Item) arrayList.get(0));
            for (int i = 1; i < arrayList.size(); i++) {
                clipData.addItem((ClipData.Item) arrayList.get(i));
            }
            return clipData;
        } catch (IllegalArgumentException unused) {
            Log.e(LOG_TAG, "buildClipData: create ClipData failed");
            return null;
        }
    }

    private ClipData dtoToClipData(PasteDataDTO pasteDataDTO) {
        PropertyDTO propertyDTO;
        String[] mimeTypes;
        if (pasteDataDTO == null || (propertyDTO = pasteDataDTO.getPropertyDTO()) == null || (mimeTypes = propertyDTO.getMimeTypes()) == null) {
            return null;
        }
        String[] strArr = new String[mimeTypes.length + 1];
        for (int i = 0; i < mimeTypes.length; i++) {
            String str = mimeTypes[i];
            if (str != null) {
                strArr[i] = convertToPlatformMimeType(str);
            }
        }
        strArr[mimeTypes.length] = ARKUI_X_DATA_FLAG;
        ClipDescription clipDescription = new ClipDescription(propertyDTO.getTag() != null ? propertyDTO.getTag() : "", strArr);
        String jsonAdditions = propertyDTO.getJsonAdditions();
        if (jsonAdditions != null) {
            WantParamsUtils.setExtrasToClipDescription(clipDescription, WantParamsUtils.jsonToExtras(jsonAdditions));
        }
        DataRecordDTO[] records = pasteDataDTO.getRecords();
        if (records == null) {
            return null;
        }
        return buildClipData(clipDescription, records);
    }

    private ClipData.Item recordToClipItem(DataRecordDTO dataRecordDTO) {
        Uri uri;
        String uri2 = dataRecordDTO.getUri();
        if (uri2 != null) {
            try {
                uri = Uri.parse(uri2);
            } catch (IllegalArgumentException unused) {
                Log.e(LOG_TAG, "recordToClipItem: Invalid URI");
                uri = null;
            }
        } else {
            uri = null;
        }
        String jsonWant = dataRecordDTO.getJsonWant();
        Intent intent = new Intent();
        Boolean bool = false;
        if (jsonWant != null && !jsonWant.isEmpty()) {
            if (!WantParamsUtils.putJsonToIntent(intent, jsonWant).booleanValue()) {
                return null;
            }
            bool = true;
        }
        if (!bool.booleanValue()) {
            intent = null;
        }
        String plainText = dataRecordDTO.getPlainText();
        String htmlText = dataRecordDTO.getHtmlText();
        if (plainText == null && htmlText != null) {
            plainText = Html.fromHtml(htmlText, 63).toString();
        }
        try {
            return new ClipData.Item(plainText, htmlText, intent, uri);
        } catch (FileUriExposedException unused2) {
            Log.e(LOG_TAG, "recordToClipItem new Item failed");
            return null;
        }
    }

    private DataRecordDTO buildDataRecordDTO(ClipData.Item item) {
        if (item == null) {
            Log.e(LOG_TAG, "buildDataRecordDTO: item is null");
            return null;
        }
        DataRecordDTO dataRecordDTO = new DataRecordDTO();
        dataRecordDTO.setHtmlText(item.getHtmlText());
        Intent intent = item.getIntent();
        dataRecordDTO.setJsonWant(intent != null ? WantParamsUtils.getJsonFromIntent(intent) : null);
        CharSequence text = item.getText();
        dataRecordDTO.setPlainText(text != null ? text.toString() : null);
        Uri uri = item.getUri();
        dataRecordDTO.setUri(uri != null ? uri.toString() : null);
        return dataRecordDTO;
    }

    private void buildDataRecordsDTO(DataRecordDTO[] dataRecordDTOArr, ClipData clipData) {
        if (dataRecordDTOArr == null || clipData == null) {
            Log.e(LOG_TAG, "buildDataRecordsDTO: null params");
            return;
        }
        int itemCount = clipData.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            dataRecordDTOArr[i] = buildDataRecordDTO(clipData.getItemAt(i));
        }
    }

    private void buildPropertyDTO(PropertyDTO propertyDTO, ClipDescription clipDescription) {
        clipDescription.getMimeTypeCount();
        propertyDTO.setMimeTypes(getDescriptionMimeTypes());
        CharSequence label = clipDescription.getLabel();
        propertyDTO.setTag(label != null ? label.toString() : null);
        propertyDTO.setTimestamp(clipDescription.getTimestamp());
        propertyDTO.setJsonAdditions(WantParamsUtils.getJsonFromClipDescription(clipDescription));
    }

    private PasteDataDTO clipDataToDTO(ClipData clipData) {
        if (clipData == null) {
            return null;
        }
        PropertyDTO propertyDTO = new PropertyDTO();
        ClipDescription description = clipData.getDescription();
        if (description == null) {
            Log.e(LOG_TAG, "clipDataToDTO: null propertyDTO or clipDescription");
            return null;
        }
        buildPropertyDTO(propertyDTO, description);
        int itemCount = clipData.getItemCount();
        if (itemCount == 0) {
            Log.e(LOG_TAG, "clipDataToDTO: clipData has no item");
            return null;
        }
        DataRecordDTO[] dataRecordDTOArr = new DataRecordDTO[itemCount];
        buildDataRecordsDTO(dataRecordDTOArr, clipData);
        PasteDataDTO pasteDataDTO = new PasteDataDTO();
        pasteDataDTO.setPropertyDTO(propertyDTO);
        pasteDataDTO.setRecords(dataRecordDTOArr);
        return pasteDataDTO;
    }

    public PasteDataDTO getData() {
        if (ensureClipManagerAvailable()) {
            return clipDataToDTO(this.clipManager.getPrimaryClip());
        }
        return null;
    }

    public int setData(PasteDataDTO pasteDataDTO) {
        if (!ensureClipManagerAvailable()) {
            return PasteboardConstants.PasteboardError.INVALID_RETURN_VALUE_ERROR.getValue();
        }
        ClipData clipDataDtoToClipData = dtoToClipData(pasteDataDTO);
        if (clipDataDtoToClipData == null) {
            return PasteboardConstants.PasteboardError.NO_DATA_ERROR.getValue();
        }
        try {
            this.clipManager.setPrimaryClip(clipDataDtoToClipData);
            return PasteboardConstants.PasteboardError.E_OK.getValue();
        } catch (IllegalStateException unused) {
            Log.e(LOG_TAG, "clipboard service status exception");
            return PasteboardConstants.PasteboardError.INVALID_PARAM_ERROR.getValue();
        } catch (SecurityException unused2) {
            Log.e(LOG_TAG, "permission denied");
            return PasteboardConstants.PasteboardError.PERMISSION_VERIFICATION_ERROR.getValue();
        } catch (RuntimeException unused3) {
            Log.e(LOG_TAG, "clipData size exceed system limit");
            return PasteboardConstants.PasteboardError.OTHER_ERROR.getValue();
        }
    }

    public boolean hasData() {
        if (!ensureClipManagerAvailable()) {
            return false;
        }
        try {
            return this.clipManager.hasPrimaryClip();
        } catch (IllegalStateException unused) {
            Log.e(LOG_TAG, "clipboard service status exception");
            return false;
        } catch (SecurityException unused2) {
            Log.e(LOG_TAG, "permission denied");
            return false;
        }
    }

    public boolean clear() {
        if (!ensureClipManagerAvailable()) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    this.clipManager.getClass().getMethod("clearPrimaryClip", new Class[0]).invoke(this.clipManager, new Object[0]);
                    return true;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    Log.e(LOG_TAG, "reflection error when calling clearPrimaryClip");
                    return false;
                }
            }
            this.clipManager.setPrimaryClip(ClipData.newPlainText("", ""));
            return true;
        } catch (IllegalStateException unused2) {
            Log.e(LOG_TAG, "clipboard service status exception");
            return false;
        } catch (SecurityException unused3) {
            Log.e(LOG_TAG, "permission denied");
            return false;
        }
    }

    private String[] getDescriptionMimeTypes() {
        String strConvertToOHMimeType;
        boolean zEquals;
        ArrayList arrayList = new ArrayList();
        if (!ensureClipManagerAvailable()) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        ClipData primaryClip = this.clipManager.getPrimaryClip();
        if (primaryClip != null) {
            ClipDescription description = primaryClip.getDescription();
            if (description == null) {
                return (String[]) arrayList.toArray(new String[0]);
            }
            boolean zHasMimeType = description.hasMimeType(MULTI_TYPE_DATA_MIME);
            boolean zHasMimeType2 = description.hasMimeType(ARKUI_X_DATA_FLAG);
            int mimeTypeCount = description.getMimeTypeCount();
            for (int i = 0; i < mimeTypeCount; i++) {
                String mimeType = description.getMimeType(i);
                if (mimeType != null && !MULTI_TYPE_DATA_MIME.equals(mimeType) && !ARKUI_X_DATA_FLAG.equals(mimeType) && ((!(zEquals = MIME_OH_TEXT_WANT.equals((strConvertToOHMimeType = convertToOHMimeType(mimeType)))) || !zHasMimeType) && (!zEquals || zHasMimeType2))) {
                    arrayList.add(strConvertToOHMimeType);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String[] getMimeTypes() {
        ArrayList arrayList = new ArrayList();
        if (!ensureClipManagerAvailable()) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        ClipData primaryClip = this.clipManager.getPrimaryClip();
        if (primaryClip == null) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        ClipDescription description = primaryClip.getDescription();
        if (description == null) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        boolean zHasMimeType = description.hasMimeType(MULTI_TYPE_DATA_MIME);
        boolean zHasMimeType2 = description.hasMimeType(ARKUI_X_DATA_FLAG);
        int itemCount = primaryClip.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            ClipData.Item itemAt = primaryClip.getItemAt(i);
            if (itemAt != null) {
                if (itemAt.getText() != null) {
                    arrayList.add(convertToOHMimeType("text/plain"));
                }
                if (itemAt.getHtmlText() != null) {
                    arrayList.add(convertToOHMimeType("text/html"));
                }
                if (itemAt.getUri() != null) {
                    arrayList.add(convertToOHMimeType(MIME_PLATFORM_TEXT_URI_LIST));
                }
                if (itemAt.getIntent() != null && zHasMimeType2 && !zHasMimeType) {
                    arrayList.add(convertToOHMimeType(MIME_PLATFORM_TEXT_INTENT));
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public boolean hasDataType(String str) {
        ClipDescription description;
        if (ensureClipManagerAvailable() && str != null && !str.isEmpty()) {
            String strConvertToPlatformMimeType = convertToPlatformMimeType(str);
            ClipData primaryClip = this.clipManager.getPrimaryClip();
            if (primaryClip != null && (description = primaryClip.getDescription()) != null) {
                boolean zHasMimeType = description.hasMimeType(MULTI_TYPE_DATA_MIME);
                boolean zHasMimeType2 = description.hasMimeType(ARKUI_X_DATA_FLAG);
                boolean zEquals = MIME_OH_TEXT_WANT.equals(str);
                if (!(zHasMimeType && zEquals) && (zHasMimeType2 || !zEquals)) {
                    return description.hasMimeType(strConvertToPlatformMimeType);
                }
                return false;
            }
        }
        return false;
    }

    private void initListener() {
        this.listener = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: ohos.ace.plugin.clipboard.ClipboardAosp.1
            @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
            public void onPrimaryClipChanged() {
                ClipDescription primaryClipDescription = ClipboardAosp.this.clipManager.getPrimaryClipDescription();
                if (primaryClipDescription == null) {
                    ClipboardAosp.this.mainHandler.post(ClipboardAosp.this.pasteboardChangeRunnable);
                    return;
                }
                long timestamp = primaryClipDescription.getTimestamp();
                if (ClipboardAosp.this.timeStamp != timestamp) {
                    ClipboardAosp.this.timeStamp = timestamp;
                    ClipboardAosp.this.mainHandler.removeCallbacks(ClipboardAosp.this.pasteboardChangeRunnable);
                    ClipboardAosp.this.mainHandler.post(ClipboardAosp.this.pasteboardChangeRunnable);
                }
            }
        };
    }

    public boolean subscribePasteboardChange() {
        if (!ensureClipManagerAvailable()) {
            return false;
        }
        if (this.subscribeCount.getAndIncrement() > 0) {
            return true;
        }
        if (this.listener == null) {
            initListener();
        }
        this.clipManager.addPrimaryClipChangedListener(this.listener);
        return true;
    }

    public boolean unsubscribePasteboardChange() {
        if (!ensureClipManagerAvailable()) {
            return false;
        }
        if (this.subscribeCount.decrementAndGet() > 0) {
            return true;
        }
        try {
            this.clipManager.removePrimaryClipChangedListener(this.listener);
        } catch (IllegalArgumentException unused) {
            Log.e(LOG_TAG, "remove listener failed: listener not registered");
        }
        return true;
    }

    private ArrayList<String> getAllTextAndHtmlText() {
        if (!ensureClipManagerAvailable()) {
            return new ArrayList<>();
        }
        ClipData primaryClip = this.clipManager.getPrimaryClip();
        if (primaryClip == null) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < primaryClip.getItemCount(); i++) {
            ClipData.Item itemAt = primaryClip.getItemAt(i);
            CharSequence text = itemAt.getText();
            String htmlText = itemAt.getHtmlText();
            if (text != null) {
                arrayList.add(text.toString());
            }
            if (htmlText != null) {
                arrayList.add(htmlText.toString());
            }
        }
        return arrayList;
    }

    private int checkPattern(String[] strArr, int i, int i2, int i3) {
        if ((i3 & i) != 0) {
            for (String str : strArr) {
                if (PatternDetection.isMatch(str, i)) {
                    return i2 | i;
                }
            }
        }
        return i2;
    }

    public int detectPatterns(int i) {
        if (i == 0) {
            return 0;
        }
        Integer num = 0;
        String[] strArr = (String[]) getAllTextAndHtmlText().toArray(new String[0]);
        if (strArr.length == 0) {
            num.getClass();
            return 0;
        }
        num.getClass();
        int iCheckPattern = checkPattern(strArr, 1, 0, i);
        Integer.valueOf(iCheckPattern).getClass();
        int iCheckPattern2 = checkPattern(strArr, 2, iCheckPattern, i);
        Integer.valueOf(iCheckPattern2).getClass();
        int iCheckPattern3 = checkPattern(strArr, 4, iCheckPattern2, i);
        Integer.valueOf(iCheckPattern3).getClass();
        return iCheckPattern3;
    }
}
