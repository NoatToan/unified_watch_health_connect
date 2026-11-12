package com.huawei.watchface.mvp.model.datatype;

import android.content.Context;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ClipOptions {
    private String clipImagePath;
    private String clipOrgFilePath;
    private boolean isSecondEdit;
    private boolean mIsClipRectangleAnyway;
    private String mOutputDirectory;
    private int mOutputHeight;
    private int mOutputWidth;
    private float mScaleX;
    private float mScaleY;
    private List<String> mSourcePaths;
    private float mTransX;
    private float mTransY;
    private ArrayList<Rect> mPresetRects = new ArrayList<>(32);
    private ArrayList<String> mResultPaths = new ArrayList<>(32);
    private Rect mClipRect = new Rect();

    public ClipOptions(Context context) {
        this.mOutputDirectory = context.getApplicationContext().getFilesDir() + "/watchfacePhoto/background/";
    }

    public String getClipOrgFilePath() {
        return this.clipOrgFilePath;
    }

    public Rect getClipRect() {
        return this.mClipRect;
    }

    public String getOutputDirectory() {
        return this.mOutputDirectory;
    }

    public int getOutputHeight() {
        return this.mOutputHeight;
    }

    public int getOutputWidth() {
        return this.mOutputWidth;
    }

    public ArrayList<Rect> getPresetRects() {
        return this.mPresetRects;
    }

    public ArrayList<String> getResultPaths() {
        return this.mResultPaths;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public List<String> getSourcePaths() {
        return this.mSourcePaths;
    }

    public float getTransX() {
        return this.mTransX;
    }

    public float getTransY() {
        return this.mTransY;
    }

    public boolean isClipRectangleAnyway() {
        return this.mIsClipRectangleAnyway;
    }

    public boolean isSecondEdit() {
        return this.isSecondEdit;
    }

    public void setClipOrgFilePath(String str) {
        this.clipOrgFilePath = str;
    }

    public void setClipRect(Rect rect) {
        this.mClipRect = rect;
    }

    public void setClipRectangleAnyway(boolean z) {
        this.mIsClipRectangleAnyway = z;
    }

    public void setOutputDirectory(String str) {
        this.mOutputDirectory = str;
    }

    public void setOutputHeight(int i) {
        this.mOutputHeight = i;
    }

    public void setOutputSize(int i, int i2) {
        this.mOutputWidth = i;
        this.mOutputHeight = i2;
    }

    public void setOutputWidth(int i) {
        this.mOutputWidth = i;
    }

    public void setPresetRects(ArrayList<Rect> arrayList) {
        this.mPresetRects = arrayList;
    }

    public void setResultPaths(ArrayList<String> arrayList) {
        this.mResultPaths = arrayList;
    }

    public void setScaleX(float f) {
        this.mScaleX = f;
    }

    public void setScaleY(float f) {
        this.mScaleY = f;
    }

    public void setSecondEdit(boolean z) {
        this.isSecondEdit = z;
    }

    public void setSourcePaths(List<String> list) {
        this.mSourcePaths = list;
    }

    public void setTransX(float f) {
        this.mTransX = f;
    }

    public void setTransY(float f) {
        this.mTransY = f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(32);
        stringBuffer.append("clipRect: clipRect.left='").append(this.mClipRect.left);
        stringBuffer.append(", clipRect.top=").append(this.mClipRect.top);
        stringBuffer.append(", clipRect.right =").append(this.mClipRect.right);
        stringBuffer.append(", clipRect.bottom=").append(this.mClipRect.bottom);
        stringBuffer.append(", outputWidth=").append(this.mOutputWidth);
        stringBuffer.append(", outputHeight=").append(this.mOutputHeight);
        return stringBuffer.toString();
    }
}
