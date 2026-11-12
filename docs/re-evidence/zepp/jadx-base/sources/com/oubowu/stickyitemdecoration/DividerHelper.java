package com.oubowu.stickyitemdecoration;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes18.dex */
public class DividerHelper {
    public static void drawBottom(Canvas canvas, Drawable drawable, View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int left = (view.getLeft() - marginLayoutParams.leftMargin) - drawable.getIntrinsicWidth();
        int right = view.getRight() + marginLayoutParams.rightMargin + drawable.getIntrinsicWidth();
        int bottom = view.getBottom() + marginLayoutParams.bottomMargin;
        drawable.setBounds(left, bottom, right, drawable.getIntrinsicHeight() + bottom);
        drawable.draw(canvas);
    }

    public static void drawBottomAlignItem(Canvas canvas, Drawable drawable, View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int left = view.getLeft() - marginLayoutParams.leftMargin;
        int right = view.getRight() + marginLayoutParams.rightMargin;
        int bottom = view.getBottom() + marginLayoutParams.bottomMargin;
        drawable.setBounds(left, bottom, right, drawable.getIntrinsicHeight() + bottom);
        drawable.draw(canvas);
    }

    public static void drawLeft(Canvas canvas, Drawable drawable, View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int top = (view.getTop() - marginLayoutParams.topMargin) - drawable.getIntrinsicHeight();
        int bottom = view.getBottom() + marginLayoutParams.bottomMargin + drawable.getIntrinsicHeight();
        int left = (view.getLeft() - marginLayoutParams.leftMargin) - drawable.getIntrinsicWidth();
        drawable.setBounds(left, top, drawable.getIntrinsicWidth() + left, bottom);
        drawable.draw(canvas);
    }

    public static void drawLeftAlignItem(Canvas canvas, Drawable drawable, View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int top = view.getTop() - marginLayoutParams.topMargin;
        int bottom = view.getBottom() + marginLayoutParams.bottomMargin;
        int left = (view.getLeft() - marginLayoutParams.leftMargin) - drawable.getIntrinsicWidth();
        drawable.setBounds(left, top, drawable.getIntrinsicWidth() + left, bottom);
        drawable.draw(canvas);
    }

    public static void drawRight(Canvas canvas, Drawable drawable, View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int top = (view.getTop() - marginLayoutParams.topMargin) - drawable.getIntrinsicHeight();
        int bottom = view.getBottom() + marginLayoutParams.bottomMargin + drawable.getIntrinsicHeight();
        int right = view.getRight() + marginLayoutParams.rightMargin;
        drawable.setBounds(right, top, drawable.getIntrinsicWidth() + right, bottom);
        drawable.draw(canvas);
    }

    public static void drawRightAlignItem(Canvas canvas, Drawable drawable, View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int top = view.getTop() - marginLayoutParams.topMargin;
        int bottom = view.getBottom() + marginLayoutParams.bottomMargin;
        int right = view.getRight() + marginLayoutParams.rightMargin;
        drawable.setBounds(right, top, drawable.getIntrinsicWidth() + right, bottom);
        drawable.draw(canvas);
    }

    public static void drawTop(Canvas canvas, Drawable drawable, View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int left = (view.getLeft() - marginLayoutParams.leftMargin) - drawable.getIntrinsicWidth();
        int right = view.getRight() + marginLayoutParams.rightMargin + drawable.getIntrinsicWidth();
        int top = (view.getTop() - marginLayoutParams.topMargin) - drawable.getIntrinsicHeight();
        drawable.setBounds(left, top, right, drawable.getIntrinsicHeight() + top);
        drawable.draw(canvas);
    }

    public static void drawTopAlignItem(Canvas canvas, Drawable drawable, View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int left = view.getLeft() - marginLayoutParams.leftMargin;
        int right = view.getRight() + marginLayoutParams.rightMargin;
        int top = (view.getTop() - marginLayoutParams.topMargin) - drawable.getIntrinsicHeight();
        drawable.setBounds(left, top, right, drawable.getIntrinsicHeight() + top);
        drawable.draw(canvas);
    }
}
