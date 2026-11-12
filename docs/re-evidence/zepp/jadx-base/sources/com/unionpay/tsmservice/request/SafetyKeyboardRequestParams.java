package com.unionpay.tsmservice.request;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.NinePatchInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class SafetyKeyboardRequestParams extends RequestParams {
    public static final Parcelable.Creator<SafetyKeyboardRequestParams> CREATOR = new a();
    private Bitmap A;
    private Bitmap B;
    private Bitmap C;
    private Bitmap D;
    private Bitmap E;
    private ArrayList<Bitmap> F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private NinePatchInfo W;
    private NinePatchInfo X;
    private NinePatchInfo Y;
    private NinePatchInfo Z;
    private String b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private NinePatchInfo m0;
    private int n;
    private boolean n0;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private Bitmap w;
    private Bitmap x;
    private Bitmap y;
    private Bitmap z;

    public static class a implements Parcelable.Creator<SafetyKeyboardRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SafetyKeyboardRequestParams createFromParcel(Parcel parcel) {
            return new SafetyKeyboardRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SafetyKeyboardRequestParams[] newArray(int i) {
            return new SafetyKeyboardRequestParams[i];
        }
    }

    public SafetyKeyboardRequestParams() {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = 1;
        this.v = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = 0;
        this.M = 1;
        this.N = 0;
        this.O = 0;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -16777216;
        this.n0 = false;
    }

    public int getConfirmBtnHeight() {
        return this.r;
    }

    public int getConfirmBtnOutPaddingRight() {
        return this.p;
    }

    public int getConfirmBtnWidth() {
        return this.q;
    }

    public int getDefaultPosition() {
        return this.u;
    }

    public Bitmap getDelBgBitmap() {
        return this.D;
    }

    public int getDelBgColor() {
        return this.J;
    }

    public Bitmap getDelForeBitmap() {
        return this.C;
    }

    public NinePatchInfo getDelKeyBgNinePatch() {
        return this.X;
    }

    public Bitmap getDoneBgBitmap() {
        return this.B;
    }

    public int getDoneBgColor() {
        return this.I;
    }

    public Bitmap getDoneForeBitmap() {
        return this.A;
    }

    public NinePatchInfo getDoneKeyBgNinePatch() {
        return this.Y;
    }

    public int getDoneRight() {
        return this.N;
    }

    public int getEnableOKBtn() {
        return this.M;
    }

    public int getInnerPaddingBottom() {
        return this.o;
    }

    public int getInnerPaddingLeft() {
        return this.l;
    }

    public int getInnerPaddingRight() {
        return this.n;
    }

    public int getInnerPaddingTop() {
        return this.m;
    }

    public int getIsAudio() {
        return this.L;
    }

    public int getIsVibrate() {
        return this.O;
    }

    public Bitmap getKeyboardBgBitmap() {
        return this.w;
    }

    public int getKeyboardBgColor() {
        return this.G;
    }

    public NinePatchInfo getKeyboardBgNinePatch() {
        return this.W;
    }

    public int getKeyboardHeight() {
        return this.d;
    }

    public int getKeyboardWidth() {
        return this.c;
    }

    public int getMarginCol() {
        return this.g;
    }

    public int getMarginRow() {
        return this.f;
    }

    public Bitmap getNumBgBitmap() {
        return this.E;
    }

    public int getNumBgColor() {
        return this.K;
    }

    public ArrayList<Bitmap> getNumForeBitmaps() {
        return this.F;
    }

    public NinePatchInfo getNumKeyBgNinePatch() {
        return this.Z;
    }

    public int getNumSize() {
        return this.v;
    }

    public int getNumberKeyColor() {
        return this.U;
    }

    public int getOutPaddingBottom() {
        return this.k;
    }

    public int getOutPaddingLeft() {
        return this.h;
    }

    public int getOutPaddingRight() {
        return this.j;
    }

    public int getOutPaddingTop() {
        return this.i;
    }

    public int getSecureHeight() {
        return this.Q;
    }

    public int getSecureWidth() {
        return this.P;
    }

    public int getStartX() {
        return this.s;
    }

    public int getStartY() {
        return this.t;
    }

    public String getTitle() {
        return this.b;
    }

    public Bitmap getTitleBgBitmap() {
        return this.x;
    }

    public int getTitleBgColor() {
        return this.H;
    }

    public NinePatchInfo getTitleBgNinePatch() {
        return this.m0;
    }

    public int getTitleColor() {
        return this.S;
    }

    public int getTitleDrawablePadding() {
        return this.R;
    }

    public Bitmap getTitleDropBitmap() {
        return this.z;
    }

    public int getTitleFont() {
        return this.V;
    }

    public int getTitleHeight() {
        return this.e;
    }

    public Bitmap getTitleIconBitmap() {
        return this.y;
    }

    public int getTitleSize() {
        return this.T;
    }

    public boolean isEnableLightStatusBar() {
        return this.n0;
    }

    public void setConfirmBtnHeight(int i) {
        this.r = i;
    }

    public void setConfirmBtnOutPaddingRight(int i) {
        this.p = i;
    }

    public void setConfirmBtnWidth(int i) {
        this.q = i;
    }

    public void setDefaultPosition(int i) {
        this.u = i;
    }

    public void setDelBgBitmap(Bitmap bitmap) {
        this.D = bitmap;
    }

    public void setDelBgColor(int i) {
        this.J = i;
    }

    public void setDelForeBitmap(Bitmap bitmap) {
        this.C = bitmap;
    }

    public void setDelKeyBgNinePatch(NinePatchInfo ninePatchInfo) {
        this.X = ninePatchInfo;
    }

    public void setDoneBgBitmap(Bitmap bitmap) {
        this.B = bitmap;
    }

    public void setDoneBgColor(int i) {
        this.I = i;
    }

    public void setDoneForeBitmap(Bitmap bitmap) {
        this.A = bitmap;
    }

    public void setDoneKeyBgNinePatch(NinePatchInfo ninePatchInfo) {
        this.Y = ninePatchInfo;
    }

    public void setDoneRight(int i) {
        this.N = i;
    }

    public void setEnableLightStatusBar(boolean z) {
        this.n0 = z;
    }

    public void setEnableOKBtn(int i) {
        this.M = i;
    }

    public void setInnerPaddingBottom(int i) {
        this.o = i;
    }

    public void setInnerPaddingLeft(int i) {
        this.l = i;
    }

    public void setInnerPaddingRight(int i) {
        this.n = i;
    }

    public void setInnerPaddingTop(int i) {
        this.m = i;
    }

    public void setIsAudio(int i) {
        this.L = i;
    }

    public void setIsVibrate(int i) {
        this.O = i;
    }

    public void setKeyboardBgBitmap(Bitmap bitmap) {
        this.w = bitmap;
    }

    public void setKeyboardBgColor(int i) {
        this.G = i;
    }

    public void setKeyboardBgNinePatch(NinePatchInfo ninePatchInfo) {
        this.W = ninePatchInfo;
    }

    public void setKeyboardHeight(int i) {
        this.d = i;
    }

    public void setKeyboardWidth(int i) {
        this.c = i;
    }

    public void setMarginCol(int i) {
        this.g = i;
    }

    public void setMarginRow(int i) {
        this.f = i;
    }

    public void setNumBgBitmap(Bitmap bitmap) {
        this.E = bitmap;
    }

    public void setNumBgColor(int i) {
        this.K = i;
    }

    public void setNumForeBitmaps(ArrayList<Bitmap> arrayList) {
        this.F = arrayList;
    }

    public void setNumKeyBgNinePatch(NinePatchInfo ninePatchInfo) {
        this.Z = ninePatchInfo;
    }

    public void setNumSize(int i) {
        this.v = i;
    }

    public void setNumberKeyColor(int i) {
        this.U = i;
    }

    public void setOutPaddingBottom(int i) {
        this.k = i;
    }

    public void setOutPaddingLeft(int i) {
        this.h = i;
    }

    public void setOutPaddingRight(int i) {
        this.j = i;
    }

    public void setOutPaddingTop(int i) {
        this.i = i;
    }

    public void setSecureHeight(int i) {
        this.Q = i;
    }

    public void setSecureWidth(int i) {
        this.P = i;
    }

    public void setStartX(int i) {
        this.s = i;
    }

    public void setStartY(int i) {
        this.t = i;
    }

    public void setTitle(String str) {
        this.b = str;
    }

    public void setTitleBgBitmap(Bitmap bitmap) {
        this.x = bitmap;
    }

    public void setTitleBgColor(int i) {
        this.H = i;
    }

    public void setTitleBgNinePatch(NinePatchInfo ninePatchInfo) {
        this.m0 = ninePatchInfo;
    }

    public void setTitleColor(int i) {
        this.S = i;
    }

    public void setTitleDrawablePadding(int i) {
        this.R = i;
    }

    public void setTitleDropBitmap(Bitmap bitmap) {
        this.z = bitmap;
    }

    public void setTitleFont(int i) {
        this.V = i;
    }

    public void setTitleHeight(int i) {
        this.e = i;
    }

    public void setTitleIconBitmap(Bitmap bitmap) {
        this.y = bitmap;
    }

    public void setTitleSize(int i) {
        this.T = i;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeParcelable(this.w, 0);
        parcel.writeParcelable(this.x, 0);
        parcel.writeParcelable(this.y, 0);
        parcel.writeParcelable(this.z, 0);
        parcel.writeParcelable(this.A, 0);
        parcel.writeParcelable(this.B, 0);
        parcel.writeParcelable(this.C, 0);
        parcel.writeParcelable(this.D, 0);
        parcel.writeParcelable(this.E, 0);
        parcel.writeList(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeParcelable(this.W, i);
        parcel.writeParcelable(this.X, i);
        parcel.writeParcelable(this.Y, i);
        parcel.writeParcelable(this.Z, i);
        parcel.writeParcelable(this.m0, i);
        parcel.writeInt(this.n0 ? 1 : 0);
    }

    public SafetyKeyboardRequestParams(Parcel parcel) {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = 1;
        this.v = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = 0;
        this.M = 1;
        this.N = 0;
        this.O = 0;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -16777216;
        this.n0 = false;
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.x = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.y = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.z = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.A = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.B = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.C = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.D = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.E = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.F = parcel.readArrayList(ArrayList.class.getClassLoader());
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.N = parcel.readInt();
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.W = (NinePatchInfo) parcel.readParcelable(NinePatchInfo.class.getClassLoader());
        this.X = (NinePatchInfo) parcel.readParcelable(NinePatchInfo.class.getClassLoader());
        this.Y = (NinePatchInfo) parcel.readParcelable(NinePatchInfo.class.getClassLoader());
        this.Z = (NinePatchInfo) parcel.readParcelable(NinePatchInfo.class.getClassLoader());
        this.m0 = (NinePatchInfo) parcel.readParcelable(NinePatchInfo.class.getClassLoader());
        this.n0 = parcel.readInt() == 1;
    }
}
