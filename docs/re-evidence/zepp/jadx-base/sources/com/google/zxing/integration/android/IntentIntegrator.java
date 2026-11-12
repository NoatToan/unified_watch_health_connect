package com.google.zxing.integration.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.zxing.client.android.Intents;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class IntentIntegrator {
    public static int REQUEST_CODE = 49374;
    private static final String g = "IntentIntegrator";
    private final Activity a;
    private Fragment b;
    private androidx.fragment.app.Fragment c;
    private final Map<String, Object> d = new HashMap(3);
    private Collection<String> e;
    private Class<?> f;
    public static final Collection<String> PRODUCT_CODE_TYPES = b("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14");
    public static final Collection<String> ONE_D_CODE_TYPES = b("UPC_A", "UPC_E", "EAN_8", "EAN_13", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED");
    public static final Collection<String> QR_CODE_TYPES = Collections.singleton("QR_CODE");
    public static final Collection<String> DATA_MATRIX_TYPES = Collections.singleton("DATA_MATRIX");
    public static final Collection<String> ALL_CODE_TYPES = null;

    public IntentIntegrator(Activity activity) {
        this.a = activity;
    }

    private void a(Intent intent) {
        for (Map.Entry<String, Object> entry : this.d.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                intent.putExtra(key, (Integer) value);
            } else if (value instanceof Long) {
                intent.putExtra(key, (Long) value);
            } else if (value instanceof Boolean) {
                intent.putExtra(key, (Boolean) value);
            } else if (value instanceof Double) {
                intent.putExtra(key, (Double) value);
            } else if (value instanceof Float) {
                intent.putExtra(key, (Float) value);
            } else if (value instanceof Bundle) {
                intent.putExtra(key, (Bundle) value);
            } else {
                intent.putExtra(key, value.toString());
            }
        }
    }

    private static List<String> b(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    @TargetApi(11)
    public static IntentIntegrator forFragment(Fragment fragment) {
        IntentIntegrator intentIntegrator = new IntentIntegrator(fragment.getActivity());
        intentIntegrator.b = fragment;
        return intentIntegrator;
    }

    public static IntentIntegrator forSupportFragment(androidx.fragment.app.Fragment fragment) {
        IntentIntegrator intentIntegrator = new IntentIntegrator(fragment.getActivity());
        intentIntegrator.c = fragment;
        return intentIntegrator;
    }

    public static IntentResult parseActivityResult(int i, int i2, Intent intent) {
        if (i != REQUEST_CODE) {
            return null;
        }
        if (i2 != -1) {
            return new IntentResult();
        }
        String stringExtra = intent.getStringExtra("SCAN_RESULT");
        String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
        byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
        int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", Integer.MIN_VALUE);
        return new IntentResult(stringExtra, stringExtra2, byteArrayExtra, intExtra != Integer.MIN_VALUE ? Integer.valueOf(intExtra) : null, intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"), intent.getStringExtra(Intents.Scan.RESULT_BARCODE_IMAGE_PATH));
    }

    public final IntentIntegrator addExtra(String str, Object obj) {
        this.d.put(str, obj);
        return this;
    }

    public Intent createScanIntent() {
        Intent intent = new Intent(this.a, getCaptureActivity());
        intent.setAction(Intents.Scan.ACTION);
        if (this.e != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : this.e) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str);
            }
            intent.putExtra("SCAN_FORMATS", sb.toString());
        }
        intent.addFlags(67108864);
        intent.addFlags(524288);
        a(intent);
        return intent;
    }

    public Class<?> getCaptureActivity() {
        if (this.f == null) {
            this.f = getDefaultCaptureActivity();
        }
        return this.f;
    }

    public Class<?> getDefaultCaptureActivity() {
        return CaptureActivity.class;
    }

    public Map<String, ?> getMoreExtras() {
        return this.d;
    }

    public final void initiateScan() {
        startActivityForResult(createScanIntent(), REQUEST_CODE);
    }

    public IntentIntegrator setBarcodeImageEnabled(boolean z) {
        addExtra(Intents.Scan.BARCODE_IMAGE_ENABLED, Boolean.valueOf(z));
        return this;
    }

    public IntentIntegrator setBeepEnabled(boolean z) {
        addExtra(Intents.Scan.BEEP_ENABLED, Boolean.valueOf(z));
        return this;
    }

    public IntentIntegrator setCameraId(int i) {
        if (i >= 0) {
            addExtra("SCAN_CAMERA_ID", Integer.valueOf(i));
        }
        return this;
    }

    public IntentIntegrator setCaptureActivity(Class<?> cls) {
        this.f = cls;
        return this;
    }

    public IntentIntegrator setDesiredBarcodeFormats(Collection<String> collection) {
        this.e = collection;
        return this;
    }

    public IntentIntegrator setOrientationLocked(boolean z) {
        addExtra(Intents.Scan.ORIENTATION_LOCKED, Boolean.valueOf(z));
        return this;
    }

    public final IntentIntegrator setPrompt(String str) {
        if (str != null) {
            addExtra("PROMPT_MESSAGE", str);
        }
        return this;
    }

    public IntentIntegrator setTimeout(long j) {
        addExtra("TIMEOUT", Long.valueOf(j));
        return this;
    }

    public void startActivity(Intent intent) {
        Fragment fragment = this.b;
        if (fragment != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                fragment.startActivity(intent);
            }
        } else {
            androidx.fragment.app.Fragment fragment2 = this.c;
            if (fragment2 != null) {
                fragment2.startActivity(intent);
            } else {
                this.a.startActivity(intent);
            }
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        Fragment fragment = this.b;
        if (fragment != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                fragment.startActivityForResult(intent, i);
            }
        } else {
            androidx.fragment.app.Fragment fragment2 = this.c;
            if (fragment2 != null) {
                fragment2.startActivityForResult(intent, i);
            } else {
                this.a.startActivityForResult(intent, i);
            }
        }
    }

    public final void initiateScan(Collection<String> collection) {
        setDesiredBarcodeFormats(collection);
        initiateScan();
    }
}
