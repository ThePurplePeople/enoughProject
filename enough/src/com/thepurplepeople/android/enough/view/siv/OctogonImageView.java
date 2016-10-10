package com.thepurplepeople.android.enough.view.siv;

import android.content.Context;
import android.util.AttributeSet;

import com.thepurplepeople.android.enough.R;
import com.thepurplepeople.android.enough.view.siv.shader.ShaderHelper;
import com.thepurplepeople.android.enough.view.siv.shader.SvgShader;

public class OctogonImageView extends ShaderImageView {

    public OctogonImageView(Context context) {
        super(context);
    }

    public OctogonImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OctogonImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public ShaderHelper createImageViewHelper() {
        return new SvgShader(R.raw.imgview_octogon);
    }
}
