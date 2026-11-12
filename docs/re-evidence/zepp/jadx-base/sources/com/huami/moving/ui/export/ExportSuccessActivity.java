package com.huami.moving.ui.export;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.R;
import com.huami.moving.ui.export.ExportSuccessActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\r"}, d2 = {"Lcom/huami/moving/ui/export/ExportSuccessActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "", "fileName", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class ExportSuccessActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "ExportSuccessActivity";

    @NotNull
    private static final String x = "FILE_NAME";

    @NotNull
    private static final String y = "ROOT_PATH";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/moving/ui/export/ExportSuccessActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "fileName", "rootPath", "", "start", ExportSuccessActivity.x, "Ljava/lang/String;", ExportSuccessActivity.y, "TAG", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context, @NotNull String fileName, @NotNull String rootPath) {
            context.startActivity(new Intent(context, (Class<?>) ExportSuccessActivity.class).putExtra(ExportSuccessActivity.x, fileName).putExtra(ExportSuccessActivity.y, rootPath));
        }
    }

    private final void initView() {
        Intent intent = getIntent();
        final String stringExtra = intent == null ? null : intent.getStringExtra(x);
        Intent intent2 = getIntent();
        String stringExtra2 = intent2 == null ? null : intent2.getStringExtra(y);
        TextView textView = (TextView) findViewById(R.id.tv_file_name_location);
        int i = R.string.run_share_export_file_name_location;
        Object[] objArr = new Object[2];
        objArr[0] = stringExtra != null ? stringExtra.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) stringExtra, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 0, false, 6, (Object) null) + 1) : null;
        objArr[1] = stringExtra2;
        textView.setText(getString(i, objArr));
        ((TextView) findViewById(R.id.tv_share)).setOnClickListener(new View.OnClickListener() { // from class: lx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportSuccessActivity.o(this.a, stringExtra, view);
            }
        });
        ((TextView) findViewById(R.id.tv_finish)).setOnClickListener(new View.OnClickListener() { // from class: kx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportSuccessActivity.p(this.a, view);
            }
        });
    }

    private final void n(String fileName) {
        Uri uriFromFile;
        Unit unit;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("application/gpx+xml");
        if (fileName == null) {
            unit = null;
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(getString(R.string.share_gpx_provider_file_authorities), Arrays.copyOf(new Object[]{getApplication().getPackageName() + ".gpxshare"}, 1));
            if (Build.VERSION.SDK_INT >= 24) {
                uriFromFile = FileProvider.getUriForFile(this, str, new File(fileName));
                intent.addFlags(1);
            } else {
                uriFromFile = Uri.fromFile(new File(fileName));
            }
            intent.putExtra("android.intent.extra.STREAM", uriFromFile);
            startActivity(intent);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Toast.makeText(this, "empty file name", 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ExportSuccessActivity exportSuccessActivity, String str, View view) {
        exportSuccessActivity.n(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(ExportSuccessActivity exportSuccessActivity, View view) {
        exportSuccessActivity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_export_success);
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        int i = R.color.s38;
        setStyle(style, ContextCompat.getColor(this, i), getString(R.string.run_share_export_file), true);
        int i2 = R.color.s1;
        setBaseTitleColor(ContextCompat.getColor(this, i2));
        setLeftImageRes(R.drawable.ic_arrow_back_20_2x, i2);
        setTitleBarBackgroundColor(ContextCompat.getColor(this, i));
        initView();
    }
}
