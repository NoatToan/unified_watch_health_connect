package com.xiaomi.fitness.baseui.dialog;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes7.dex */
public class DialogParams implements Parcelable {
    public static final Parcelable.Creator<DialogParams> CREATOR = new a();
    ListAdapter mAdapter;
    boolean mButtonVertical;
    boolean mCancelOnBackPressed;
    boolean mCancelable;
    boolean mCanceledOnTouchOutside;
    int mCustomLayoutId;
    int mCustomTitleId;
    View mCustomView;
    DialogDescriptionString mDescriptionString;
    int mDialogDescriptionId;
    String mDialogName;
    int mDialogTheme;
    int mDialogTitleId;
    DialogDescriptionString mDialogTitleString;
    int mHtmlContentId;
    String[] mItems;
    int mItemsCheckedIndex;
    boolean[] mItemsChoices;
    String mNegativeButtonText;
    int mNegativeButtonTextId;
    String mNeutralButtonText;
    int mNeutralButtonTextId;
    String mPositiveButtonText;
    int mPositiveButtonTextId;

    public class a implements Parcelable.Creator<DialogParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DialogParams createFromParcel(Parcel parcel) {
            return new DialogParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DialogParams[] newArray(int i) {
            return new DialogParams[i];
        }
    }

    public DialogParams(String str) {
        this.mItemsCheckedIndex = -1;
        this.mCancelable = true;
        this.mCancelOnBackPressed = true;
        this.mDialogName = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDialogName);
        parcel.writeByte(this.mButtonVertical ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mPositiveButtonTextId);
        parcel.writeInt(this.mNeutralButtonTextId);
        parcel.writeInt(this.mNegativeButtonTextId);
        parcel.writeInt(this.mDialogTitleId);
        parcel.writeInt(this.mDialogDescriptionId);
        parcel.writeInt(this.mHtmlContentId);
        parcel.writeByte(this.mCancelable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mCanceledOnTouchOutside ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mCancelOnBackPressed ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mCustomLayoutId);
        parcel.writeInt(this.mCustomTitleId);
        parcel.writeParcelable(this.mDescriptionString, i);
        parcel.writeStringArray(this.mItems);
        parcel.writeInt(this.mItemsCheckedIndex);
        parcel.writeBooleanArray(this.mItemsChoices);
        parcel.writeString(this.mPositiveButtonText);
        parcel.writeString(this.mNeutralButtonText);
        parcel.writeString(this.mNegativeButtonText);
    }

    public static class DialogDescriptionString implements Parcelable {
        public static final Parcelable.Creator<DialogDescriptionString> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11659b;
        public CharSequence c;
        public Object[] d;

        public class a implements Parcelable.Creator<DialogDescriptionString> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public DialogDescriptionString createFromParcel(Parcel parcel) {
                return new DialogDescriptionString(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public DialogDescriptionString[] newArray(int i) {
                return new DialogDescriptionString[i];
            }
        }

        public DialogDescriptionString(int i, Object... objArr) {
            this.f11658a = false;
            this.f11659b = i;
            this.d = objArr;
        }

        public CharSequence a() {
            return this.c;
        }

        public String c(Context context) {
            return this.f11658a ? context.getResources().getQuantityString(this.f11659b, ((Integer) this.d[0]).intValue(), this.d[0]) : context.getResources().getString(this.f11659b, this.d);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11659b);
            parcel.writeArray(this.d);
            parcel.writeInt(this.f11658a ? 1 : 0);
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                parcel.writeString(charSequence.toString());
            }
        }

        public DialogDescriptionString(boolean z, int i, Object... objArr) {
            this.f11658a = z;
            this.f11659b = i;
            this.d = objArr;
        }

        public DialogDescriptionString(Parcel parcel) {
            this.f11659b = parcel.readInt();
            this.d = parcel.readArray(Object.class.getClassLoader());
            this.f11658a = parcel.readInt() == 1;
            this.c = parcel.readString();
        }

        public DialogDescriptionString(CharSequence charSequence) {
            this.c = charSequence;
        }
    }

    public DialogParams(Parcel parcel) {
        this.mItemsCheckedIndex = -1;
        this.mCancelable = true;
        this.mCancelOnBackPressed = true;
        this.mDialogName = parcel.readString();
        this.mButtonVertical = parcel.readByte() != 0;
        this.mPositiveButtonTextId = parcel.readInt();
        this.mNeutralButtonTextId = parcel.readInt();
        this.mNegativeButtonTextId = parcel.readInt();
        this.mDialogTitleId = parcel.readInt();
        this.mDialogDescriptionId = parcel.readInt();
        this.mHtmlContentId = parcel.readInt();
        this.mCancelable = parcel.readByte() != 0;
        this.mCanceledOnTouchOutside = parcel.readByte() != 0;
        this.mCancelOnBackPressed = parcel.readByte() != 0;
        this.mCustomLayoutId = parcel.readInt();
        this.mCustomTitleId = parcel.readInt();
        this.mDescriptionString = (DialogDescriptionString) parcel.readParcelable(DialogDescriptionString.class.getClassLoader());
        this.mItems = parcel.createStringArray();
        this.mItemsCheckedIndex = parcel.readInt();
        this.mItemsChoices = parcel.createBooleanArray();
        this.mPositiveButtonText = parcel.readString();
        this.mNeutralButtonText = parcel.readString();
        this.mNegativeButtonText = parcel.readString();
    }
}
