package com.xiaomi.hm.health.relation;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import com.baseflow.permissionhandler.m;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.relatives.UserCard;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.cloud.WebResponse;
import com.huami.widget.share.ShareConfig;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.ShareDialog;
import com.huami.widget.share.ShareListener;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.relation.utils.QrCodeUtils;
import com.xiaomi.hm.health.relation.utils.Utils;
import java.io.File;

/* JADX INFO: loaded from: classes21.dex */
public class UserQRCardActivity extends BaseTitleActivity implements View.OnClickListener {
    private static final String D = "card";
    private static final String E = "qr_code";
    private static final String F = "UserQRCardActivity";
    private static final String G = "qr_share.png";
    private static final String H = "qr_share_relation_new.png";
    private View A;
    private UserCard B;
    private TextView C;
    private File x;
    private ImageView y;
    private Bitmap z;

    public class a implements FriendManager.TokenRequestHandler {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bitmap bitmap) {
            if (UserQRCardActivity.this.isFinishing() || UserQRCardActivity.this.A == null) {
                return;
            }
            UserQRCardActivity.this.A.setEnabled(true);
            UserQRCardActivity.this.y.setImageBitmap(bitmap);
            UserQRCardActivity.this.z = bitmap;
        }

        @Override // com.xiaomi.hm.health.relation.FriendManager.TokenRequestHandler
        public void onFailed() {
            IconToast.showError(UserQRCardActivity.this, R.string.relatives_load_fail);
        }

        @Override // com.xiaomi.hm.health.relation.FriendManager.TokenRequestHandler
        public void onSuccess(String str) {
            UserQRCardActivity.this.B.token = str;
            if (UserQRCardActivity.this.z == null) {
                new c(this.a, UserQRCardActivity.this.x, new c.a() { // from class: com.xiaomi.hm.health.relation.h
                    @Override // com.xiaomi.hm.health.relation.UserQRCardActivity.c.a
                    public final void a(Bitmap bitmap) {
                        this.a.b(bitmap);
                    }
                }).execute(UserQRCardActivity.this.B);
            } else {
                UserQRCardActivity.this.A.setEnabled(true);
                UserQRCardActivity.this.y.setImageBitmap(UserQRCardActivity.this.z);
            }
        }
    }

    public class b implements ShareListener {
        public final /* synthetic */ d a;

        public b(d dVar) {
            this.a = dVar;
        }

        @Override // com.huami.widget.share.ShareListener
        public void onFailed(int i, String str) {
            HMLog.w(UserQRCardActivity.F, str, new Object[0]);
        }

        @Override // com.huami.widget.share.ShareListener
        public ShareContent onShareContentCreated(int i) {
            return this.a.d(UserQRCardActivity.this.z);
        }

        @Override // com.huami.widget.share.ShareListener
        public void onStart(int i) {
        }

        @Override // com.huami.widget.share.ShareListener
        public void onSuccess(int i) {
        }
    }

    public static class c extends AsyncTask<UserCard, Integer, Bitmap> {
        private int a;
        private final File b;
        private final a c;

        public interface a {
            void a(Bitmap bitmap);
        }

        public c(int i, File file, a aVar) {
            this.a = 0;
            this.a = i;
            this.b = file;
            this.c = aVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(UserCard... userCardArr) throws Throwable {
            if (userCardArr != null && userCardArr.length != 0) {
                UserCard userCard = userCardArr[0];
                UserCard userCard2 = new UserCard();
                userCard2.uid = userCard.uid;
                userCard2.username = userCard.username;
                userCard2.token = userCard.token;
                try {
                    Bitmap bitmapEncodeAsBitmap = QrCodeUtils.encodeAsBitmap(userCard2, this.a);
                    if (bitmapEncodeAsBitmap != null) {
                        Utils.saveBitmapToPngFile(this.b.getAbsolutePath(), bitmapEncodeAsBitmap);
                    }
                    return bitmapEncodeAsBitmap;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            this.c.a(bitmap);
        }
    }

    public class d {
        private static final int c = 680;
        private static final int d = 958;
        private static final int e = 160;
        private static final int f = 100;
        private File a;

        private d() {
        }

        private void a(Paint paint, Canvas canvas, Bitmap bitmap) {
            String string = UserQRCardActivity.this.getString(R.string.relatives_app_name);
            Paint paint2 = new Paint();
            paint2.setColor(Color.rgb(DataTypeSource.SPORT_TYPE_DISCO, DataTypeSource.SPORT_TYPE_DISCO, DataTypeSource.SPORT_TYPE_DISCO));
            paint2.setTextSize(30.0f);
            paint2.setAntiAlias(true);
            int width = (680 - (bitmap.getWidth() + e(paint2, string))) / 2;
            int height = (((100 - bitmap.getHeight()) / 2) + d) - 100;
            canvas.drawBitmap(bitmap, width, height, paint);
            canvas.drawText(string, width + bitmap.getWidth(), height + (bitmap.getHeight() / 2) + 10, paint2);
            canvas.restore();
        }

        private void b(String str, float f2, float f3, Paint paint, Canvas canvas) {
            paint.setTextAlign(Paint.Align.CENTER);
            String[] strArrSplit = str.split("\n");
            float fDescent = (-paint.ascent()) + paint.descent();
            if (paint.getStyle() == Paint.Style.FILL_AND_STROKE || paint.getStyle() == Paint.Style.STROKE) {
                fDescent += paint.getStrokeWidth();
            }
            float f4 = 0.3f * fDescent;
            for (int i = 0; i < strArrSplit.length; i++) {
                canvas.drawText(strArrSplit[i], f2, ((fDescent + f4) * i) + f3, paint);
            }
        }

        private File c(Bitmap bitmap) {
            Bitmap bitmap2;
            File shareCacheFile = FileUtils.getShareCacheFile(UserQRCardActivity.this, UserQRCardActivity.G);
            this.a = shareCacheFile;
            if (shareCacheFile.exists()) {
                this.a.delete();
            }
            this.a = FileUtils.getShareCacheFile(UserQRCardActivity.this, UserQRCardActivity.H);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c, d, Bitmap.Config.ARGB_8888);
            Resources resources = UserQRCardActivity.this.getResources();
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.save();
            paint.setColor(-1);
            canvas.drawRect(new Rect(0, 0, c, 160), paint);
            RectF rectF = new RectF(36.0f, 30.0f, 136.0f, 130.0f);
            paint.setColor(Color.rgb(190, 190, 190));
            canvas.drawOval(rectF, paint);
            Bitmap bitmapDecodeResource = null;
            if (UserQRCardActivity.this.B != null && !TextUtils.isEmpty(UserQRCardActivity.this.B.icon) && (bitmap2 = HMImageLoader.with((FragmentActivity) UserQRCardActivity.this).load(UserQRCardActivity.this.B.icon).get(90, 90)) != null) {
                bitmapDecodeResource = Utils.clipToRoundBitmap(bitmap2);
                bitmap2.recycle();
            }
            if (bitmapDecodeResource == null) {
                bitmapDecodeResource = BitmapFactory.decodeResource(resources, R.drawable.relatives_default_friend_avatar);
            }
            canvas.drawBitmap(bitmapDecodeResource, new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight()), new RectF(41.0f, 35.0f, 131.0f, 125.0f), paint);
            paint.setColor(Color.rgb(86, 86, 86));
            paint.setTextSize(30.0f);
            canvas.drawText(UserQRCardActivity.this.B.username, 156.0f, 75.0f, paint);
            paint.setColor(Color.rgb(DataTypeSource.SPORT_TYPE_DISCO, DataTypeSource.SPORT_TYPE_DISCO, DataTypeSource.SPORT_TYPE_DISCO));
            paint.setTextSize(26.0f);
            canvas.drawText(UserQRCardActivity.this.B.uid + "", 156.0f, 111.0f, paint);
            paint.setColor(Color.rgb(246, 246, 246));
            canvas.drawRect(new Rect(0, 160, c, 858), paint);
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            Rect rect2 = new Rect(142, m.d, 538, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
            paint.setColor(-16777216);
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            UserQRCardActivity userQRCardActivity = UserQRCardActivity.this;
            int i = R.string.relatives_label_share_info_1;
            int i2 = R.string.relatives_app_name;
            String string = userQRCardActivity.getString(i, new Object[]{userQRCardActivity.getString(i2)});
            paint.setColor(Color.rgb(86, 86, 86));
            paint.setTextSize(30.0f);
            canvas.drawText(string, (680 - e(paint, string)) / 2, WebResponse.CODE_LIKED, paint);
            paint.setColor(Color.rgb(DataTypeSource.SPORT_TYPE_DISCO, DataTypeSource.SPORT_TYPE_DISCO, DataTypeSource.SPORT_TYPE_DISCO));
            paint.setTextSize(26.0f);
            UserQRCardActivity userQRCardActivity2 = UserQRCardActivity.this;
            String string2 = userQRCardActivity2.getString(R.string.relatives_label_share_info_2, new Object[]{userQRCardActivity2.getString(i2)});
            TextPaint textPaint = new TextPaint();
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setTextSize(26.0f);
            textPaint.setColor(Color.rgb(DataTypeSource.SPORT_TYPE_DISCO, DataTypeSource.SPORT_TYPE_DISCO, DataTypeSource.SPORT_TYPE_DISCO));
            int iMeasureText = (int) textPaint.measureText(string2);
            int i3 = 680 - ((int) (resources.getDisplayMetrics().density * 16.0f));
            StaticLayout staticLayout = new StaticLayout(string2, textPaint, iMeasureText > i3 ? i3 : iMeasureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(340.0f, 722);
            staticLayout.draw(canvas);
            canvas.restore();
            Paint paint2 = new Paint();
            Rect rect3 = new Rect(0, 858, c, d);
            paint2.setColor(Color.rgb(246, 246, 246));
            canvas.drawRect(rect3, paint2);
            if (!DifferenceManager.isBuildMidong()) {
                a(paint, canvas, BitmapFactory.decodeResource(resources, R.drawable.relatives_ic_share_logo_xiaomi));
            } else if (DifferenceManager.isBuildAmazfit()) {
                a(paint, canvas, BitmapFactory.decodeResource(resources, R.drawable.relatives_ic_share_logo_amazfit));
            } else {
                Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(resources, R.drawable.relatives_ic_share_logo_zepp);
                canvas.drawBitmap(bitmapDecodeResource2, (c - bitmapDecodeResource2.getWidth()) / 2, (((100 - bitmapDecodeResource2.getHeight()) / 2) + d) - 100, paint);
            }
            Utils.saveBitmapToFile(this.a.getAbsolutePath(), bitmapCreateBitmap);
            return this.a;
        }

        public ShareContent d(Bitmap bitmap) {
            File fileC = c(bitmap);
            String string = UserQRCardActivity.this.getString(R.string.relatives_label_my_qrcode);
            UserQRCardActivity userQRCardActivity = UserQRCardActivity.this;
            String string2 = userQRCardActivity.getString(R.string.relatives_share_to_topic, new Object[]{userQRCardActivity.getString(R.string.relatives_app_name)});
            ShareContent shareContent = new ShareContent();
            shareContent.title = string;
            shareContent.url = "";
            shareContent.bitmapUrl = fileC.getAbsolutePath();
            shareContent.topic = string2;
            return shareContent;
        }

        public int e(Paint paint, String str) {
            Rect rect = new Rect();
            paint.getTextBounds(str, 0, str.length(), rect);
            return rect.width();
        }
    }

    public static Intent createIntent(Context context, long j, String str, String str2) {
        UserCard userCard = new UserCard();
        userCard.uid = j;
        userCard.icon = str;
        userCard.username = str2;
        Intent intent = new Intent(context, (Class<?>) UserQRCardActivity.class);
        intent.putExtra("card", userCard);
        return intent;
    }

    private void s() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        FriendManager.getInstance().requestTokenForQrCode(new a(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(String str, View view) {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("userId", str));
        CustomToast.makeText(this, getString(R.string.relatives_id_copied), 0).show();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d dVar = new d();
        ShareConfig shareConfig = new ShareConfig();
        shareConfig.isOnlyImage = true;
        shareConfig.title = getString(R.string.relatives_share_to);
        ShareDialog shareDialogNewInstance = ShareDialog.newInstance(shareConfig);
        shareDialogNewInstance.setShareListener(new b(dVar));
        shareDialogNewInstance.show(getSupportFragmentManager());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.relatives_activity_user_card);
        DifferenceManager.isBuildMidong();
        FriendFragKt.setUnifyTitleStyle(this, getString(R.string.relatives_label_my_qrcode));
        TextView textView = (TextView) findViewById(R.id.tv_scan_tip);
        this.C = textView;
        textView.setText(getString(R.string.relatives_label_my_qrcode_tips, new Object[]{getString(R.string.relatives_app_name)}));
        this.y = (ImageView) findViewById(R.id.qr_code);
        View viewFindViewById = findViewById(R.id.share_button);
        this.A = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        this.A.setEnabled(false);
        TextView textView2 = (TextView) findViewById(R.id.user_id);
        final String userid = HMPersonInfo.getInstance().getUserInfo().getUserid();
        textView2.setText("ID: " + userid);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: r78
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.t(userid, view);
            }
        });
        this.B = (UserCard) getIntent().getSerializableExtra("card");
        this.x = FileUtils.getShareCacheFile(this, this.B.uid + ".png");
        if (NetUtil.isNetworkConnected(this)) {
            return;
        }
        IconToast.showError(this, R.string.network_error);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        s();
    }
}
